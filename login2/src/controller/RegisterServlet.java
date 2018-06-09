package controller;

import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String rePassword = request.getParameter("rePassword");

        if (!password.equals(rePassword) || (userName.length() < 4) || (userName.length() > 16) || (password.length() < 8)) {
            response.sendRedirect("register.jsp");
        } else {
            UserDao userDao = new UserDao();

            if (userDao.register(userName, password)) {
                response.sendRedirect("login.jsp");
            } else {
                response.sendRedirect("register.jsp");
            }
        }
    }
}
