import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FirstServletnam", urlPatterns = {"/resservlet"})
public class ResServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        Cookie ck[]=request.getCookies();
        String tmp = "";
        Cookie c = null;
        for (int i = 0; i < ck.length; i++) {
            c = ck[i];
            tmp += c.getName() + " = " + c.getValue() + "<br>";
        }
        request.setAttribute("messages", tmp + "\nПривет! Хочешь сменить имя?");
        //response.addCookie(c);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Cookie ck[]=request.getCookies();
        String tmp = "";
        Cookie c = null;
        for (int i = 0; i < ck.length; i++) {
            c = ck[i];
            tmp += c.getName() + " = " + c.getValue() + "<br>";
        }
        request.setAttribute("messages", tmp + "\nПривет! Хочешь сменить имя?");
        //response.addCookie(c);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
