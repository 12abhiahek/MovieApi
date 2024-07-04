package com.example.movieflex.MovieApi.controller;

import com.example.movieflex.MovieApi.sevice.fileService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;

import static org.springframework.http.MediaType.*;

@RestController
@RequestMapping("/files/")
public class fileController {

    private final fileService movies;

    @Value("${project.poster}")

    private String path;

    public fileController(fileService movies) {
        this.movies = movies;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadfilehandler(@RequestPart MultipartFile file) throws IOException {
        String uploadfilename = movies.uplodefile(path, file);
        return ResponseEntity.ok("file upload"+uploadfilename);
    }

    @GetMapping("/{fileName}")
    public void servefilehandler(@PathVariable String fileName, HttpServletResponse response) throws IOException {
        InputStream resourcefile = movies.getResource(path, fileName);
        response.setContentType(IMAGE_PNG_VALUE);
        StreamUtils.copy(resourcefile, response.getOutputStream());

    }

}
