/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.login;

import com.example.model.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    public void init() throws ServletException{
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        UserBean ub = new UserBean();
        boolean val = ub.isUserValid(user, pass);
        HttpSession session = request.getSession();
        session.setAttribute("username", user);
        
        if(val){
           RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
           rd.forward(request, response);
        }else{
            response.sendRedirect("index.html");
        }
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        processRequest(request, response);
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        processRequest(request, response);
    }
    public void destroy(){
        
    }
}
