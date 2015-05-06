/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcessAdminServlet extends HttpServlet {
    public void init() throws ServletException{
        
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String type = request.getParameter("type");
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String[]lang = request.getParameterValues("lang");
        String box = request.getParameter("box");
        PrintWriter out = response.getWriter();
        out.println("<h1> type:" +type+ "</h1>");
        out.println("<h1>"+"Hello, "+name+"</h1>");
        out.println("<h2>Are you sure about that course: "+course+"?</h2>");
        for(int i=0; i<lang.length; i++){
            out.println("<h3> You've chosen: "+lang[i]+"</h3>");
        }
        if(box.equals("Manny"))
            out.println("<h3>Manny</h3>");
        else
            out.println("<h3>Floyd</h3>");
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        doGet(request, response);
    }
    public void destroy(){
        
    }
}
