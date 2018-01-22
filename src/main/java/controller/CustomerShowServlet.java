package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("customer_show?id={id}")
public class CustomerShowServlet extends HttpServlet{
    /**
     * create customer page
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        //TODO
    }

    /**
     * submit the create form
     * @param req
     * @param resp
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp){
        //TODO
    }
}
