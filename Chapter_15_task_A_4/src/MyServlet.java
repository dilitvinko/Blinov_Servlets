import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
        response.setContentType("text/html");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        configureResponse(response);


        culcResult(request.getParameter("whatJSPuse"), request, response);
        request.getRequestDispatcher("result.jsp").forward(request, response);


    }

    private void configureResponse(HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
    }

    @Override
    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
    }

    private void culcResult(String whatJSPuse, HttpServletRequest request, HttpServletResponse response){
        switch (whatJSPuse){
            case "kub_1":{
                request.setAttribute("res", culcKub(Integer.parseInt(request.getParameter("a"))));
                request.setAttribute("fig", "КУБ kub");
                break;
            }
            case "parall_2":{
                request.setAttribute("res", culcParall(Integer.parseInt(request.getParameter("a")),
                        Integer.parseInt(request.getParameter("b")),Integer.parseInt(request.getParameter("c"))));
                request.setAttribute("fig", " паралл Parall");
                break;
            }
            case "sfera_3":{
                request.setAttribute("res", culcSfera(Integer.parseInt(request.getParameter("r"))));
                request.setAttribute("fig", " Сфера sfera");
                break;
            }


        }
    }

    private double culcKub(int a){
        return a*a*a;
    }
    private double culcParall(int a, int b, int c){
        return a*b*c;
    }
    private double culcSfera(int r){
        return r*r*r*3.14*4/3;
    }
}
