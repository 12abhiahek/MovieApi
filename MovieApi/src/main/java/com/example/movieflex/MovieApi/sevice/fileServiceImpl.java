package com.example.movieflex.MovieApi.sevice;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class fileServiceImpl implements fileService {
    @Override
    public String uplodefile(String path, MultipartFile file) throws IOException {
        //get name of file
        String fileName=file.getOriginalFilename();
        //get path name
        String filepath=path + File.separator + fileName;
        //create file object
        File f=new File(path);
        if(!f.exists()) {
            f.mkdirs();
        }
        //file copy or upload file to path
        Files.copy(file.getInputStream(), Paths.get(filepath), StandardCopyOption.REPLACE_EXISTING);
        return fileName;
    }

    @Override
    public InputStream getResource(String path, String filename) throws FileNotFoundException {

        String filepath=path + File.separator +  filename;
        return new FileInputStream(filepath);
    }
}
