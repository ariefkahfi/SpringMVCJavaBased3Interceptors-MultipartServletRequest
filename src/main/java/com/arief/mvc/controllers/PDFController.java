package com.arief.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PDFController {


    public List<String> stringsList(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("This");
        stringList.add("is");
        stringList.add("PDF");
        stringList.add("Document");
        return stringList;
    }

    @RequestMapping("/get-pdf")
    public ModelAndView pdfView(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("text",stringsList());
        mav.setViewName("pdfView");
        return mav;
    }
}
