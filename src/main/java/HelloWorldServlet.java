import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/Hello-World")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int count = Integer.parseInt(request.getParameter("count"));
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        for(int i = 0; i < count; i++){
            out.println("<h1>Hello, World!</h1>");
        }
    }

}
