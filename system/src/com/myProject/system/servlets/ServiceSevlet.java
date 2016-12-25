package com.myProject.system.servlets;

/**
 * Created by yang on 20/12/16.
 */

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.io.BufferedReader;
import java.io.IOException;

public class ServiceSevlet extends HttpServlet{

    // Constructor
    public ServiceSevlet() {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println(request.getContextPath());
        response.setContentType("text/html");
        response.getWriter().println("Response");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        StringBuffer buffer = new StringBuffer();
        String line;
        while((line = reader.readLine()) != null) {
            buffer.append(line);
            System.out.println(line);
        }
        System.out.println("Post data -> " + buffer);
        response.getWriter().println("Post received");
    }
}
