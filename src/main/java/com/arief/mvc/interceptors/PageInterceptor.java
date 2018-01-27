package com.arief.mvc.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

public class PageInterceptor implements HandlerInterceptor {


    private static final Logger LOGGER = Logger.getLogger(PageInterceptor.class.getName());

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOGGER.info("preHandle called");
        String usernameLogin = (String) request.getSession().getAttribute("username_login");
        if(usernameLogin == null || usernameLogin.equals("unknown")){
            response.sendError(403);
            return  false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOGGER.info("postHandle called");
    }
}
