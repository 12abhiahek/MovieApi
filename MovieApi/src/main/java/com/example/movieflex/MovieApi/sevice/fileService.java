package com.example.movieflex.MovieApi.sevice;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface fileService {
    String uplodefile(String path, MultipartFile file) throws IOException;

    InputStream getResource(String path,String filename) throws FileNotFoundException;
}
