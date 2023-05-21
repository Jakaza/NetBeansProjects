/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Student
 */
public class UserLoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        // Fetch user details from the database
        // Check if email and password matches with entered values.
        // save user to session
        // Go to main page
        
//        String url = "bookings_page.jsp";
        
        
        
        if (email == null) {
            // Redirect to a success page or homepage
            response.sendRedirect("user_login.jsp?error=true");
        } else {
            // Invalid credentials, redirect back to the login page with an error message
            response.sendRedirect("bookings_page.jsp");
        }
//        
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher(url);  
//        requestDispatcher.forward(request, response);

    }
}
