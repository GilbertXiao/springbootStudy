package com.gilxyj.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @program: fileupload05
 * @description:
 * @author: GilbertXiao
 * @create: 2019-07-25 23:24
 **/
@RestController
public class FileUploadController {

   SimpleDateFormat sdf= new SimpleDateFormat("/yyyy/MM/dd/");

    @PostMapping("/upload")
    public String uploadFile(MultipartFile file, HttpServletRequest request){

        String dateFolder = sdf.format(new Date());
        String realPath = request.getSession().getServletContext().getRealPath("/uploadfile");
        File realFolder = new File(realPath + dateFolder);
        if(!realFolder.exists()){
            realFolder.mkdirs();
        }

        System.out.println(realFolder);

        String newFileName=UUID.randomUUID().toString()+file.getOriginalFilename();
        try {
            file.transferTo(new File(realFolder, newFileName));

            String filePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/uploadfile"+dateFolder+newFileName;
            return filePath;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "failed";
    }

}
