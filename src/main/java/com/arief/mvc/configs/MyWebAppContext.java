package com.arief.mvc.configs;

import com.arief.mvc.interceptors.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.handler.MappedInterceptor;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;

import java.io.FileInputStream;
import java.io.InputStream;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.arief.mvc.controllers"})
public class MyWebAppContext implements WebMvcConfigurer {


    @Bean
    public ViewResolver pdfViewResolver(){
        ResourceBundleViewResolver viewResolver = new ResourceBundleViewResolver();
        viewResolver.setBasename("pdf-view");
        viewResolver.setOrder(1);
        return viewResolver;
    }

    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/",".jsp");
        registry.viewResolver(pdfViewResolver());
    }
    @Bean
    public CommonsMultipartResolver commonsMultipartResolver(){
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSizePerFile(50000000);
        return multipartResolver;
    }



    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(new PageInterceptor())
                .addPathPatterns("/pages/**");
        // NOTE : addPathPatterns not include servletUrlPattern
        //        just include your controller path / (@RequestMapping) to intercept
    }
}
