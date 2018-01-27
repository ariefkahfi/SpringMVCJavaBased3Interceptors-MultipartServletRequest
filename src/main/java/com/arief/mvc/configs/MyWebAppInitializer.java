package com.arief.mvc.configs;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{

        };
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        MultipartServletConfig multipartServletConfig
                 = new MultipartServletConfig("/usr/local/apache/uploads/");
        registration.setMultipartConfig(multipartServletConfig);
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                MyWebAppContext.class
        };
    }



    protected String[] getServletMappings() {
        return new String[]{
                "/mvc/*"
        };
    }
}
