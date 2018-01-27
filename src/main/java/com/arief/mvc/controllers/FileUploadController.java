package com.arief.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class FileUploadController {


    @RequestMapping(value = "/upload",method = RequestMethod.GET)
    public String uploadFormView(){
        return "upload";
    }
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String doUpload(
            @RequestParam("name")String n,
            @RequestParam("file")MultipartFile multipartFile, HttpSession session) throws IOException {


        if(n == null || n.trim().equals("")){
            session.setAttribute("username_login","unknown");
        }else{
            session.setAttribute("username_login",n);
        }

        System.out.println("file name " + multipartFile.getName());
        System.out.println("original name : " + multipartFile.getOriginalFilename());

        multipartFile.transferTo(new File(multipartFile.getOriginalFilename()));

        return "redirect:";
    }
}
