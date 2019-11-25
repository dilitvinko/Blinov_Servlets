import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;




@WebServlet(name = "FirstServletname", urlPatterns = {"/myservl"})
public class MyServlet extends HttpServlet {
    public MyServlet() {
        super();
    }
    public void init() throws ServletException {
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        configureResponse(response);


        //String n=request.getParameter("userName");

        Cookie c = new Cookie("qwe", request.getParameter("a"));
        response.addCookie(c);

        Cookie ck[]=request.getCookies();
        String tmp = "";
        for (int i = 0; i < ck.length; i++) {
            Cookie cc = ck[i];
            tmp += cc.getName() + " = " + cc.getValue() + "<br>";
        }
        request.setAttribute("messages", tmp + "\nВаше имя: ");
        response.sendRedirect("/resservlet");
        //request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    private void configureResponse(HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
    }

    @Override
    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
    }




}
