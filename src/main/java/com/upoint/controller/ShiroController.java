package com.upoint.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ShiroController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        System.out.println("login");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session=request.getSession(true);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            if (subject.isAuthenticated()) {
                session.setAttribute("username", username);
                return "success";
            } else {
                return "login";
            }
        } catch (Exception e) {
            session.setAttribute("message", "wrong");
            e.printStackTrace();
            return "login";
        }

    }

}
