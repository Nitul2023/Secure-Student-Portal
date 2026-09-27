package com.student.dynamic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.pentagon.StudentDAO.StudentDAO;
import com.pentagon.StudentDAO.StudentDAOImp;
import com.pentagon.StudentDTO.Student;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student s = null;
        StudentDAO st = new StudentDAOImp();
        HttpSession session = req.getSession(true);

        s = st.getStudent(req.getParameter("email"), req.getParameter("password"));

        if (s != null) {
            session.setAttribute("student", s);
            session.setAttribute("success", "Logged in Successfully :)");
            resp.sendRedirect("dashboard.jsp");
        } else {
            req.setAttribute("error", "Failed To Log In :(");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }

}
