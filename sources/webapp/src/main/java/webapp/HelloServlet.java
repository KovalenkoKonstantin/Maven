package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
//http://localhost:8080/webapp-1.0-SNAPSHOT/hello
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("Hello world " + req.getMethod());
        HttpSession session = req.getSession();

        //if (session.getValue("name") == null) {
        //session.putValue("name", " Hello world session");
        if (session.getAttribute("name") == null) {
            session.setAttribute("name", " Hello world correct session");
            resp.getWriter().append(" No session");
        } else {
            //resp.getWriter().append((String) session.getValue("name"));
            resp.getWriter().append((CharSequence) session.getAttribute("name"));
        }
    }
}
