package artifex;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "controllera")
public class controllera extends HttpServlet {
    String fname;
    String lname;
    String email;
    String uname;
    String id;
    String action;
    String psw;
String name;
String content;
    Connect cn=new Connect();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       action=request.getParameter("action");
        if(action==null)
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        else if(action.equals("doInsert")) {
            fname=request.getParameter("fname");
            lname = request.getParameter("lname");
            email = request.getParameter("email");
            uname = request.getParameter("uname");
            psw   = request.getParameter("psw");



            request.setAttribute("fname", fname);
            request.setAttribute("lname", lname);
            request.setAttribute("email", email);
            request.setAttribute("uname", uname);
            request.setAttribute("psw",   psw);

            cn.insert(fname,lname,email,uname,psw);

            request.getRequestDispatcher("/success.jsp").forward(request, response);

        }
      
    }
   
}
