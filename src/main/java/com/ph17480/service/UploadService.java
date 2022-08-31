package com.ph17480.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public interface UploadService {
    public File save(MultipartFile file, String folder) ;

}
