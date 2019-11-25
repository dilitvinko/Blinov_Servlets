import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = { "/myservl" },
        initParams = {
                @WebInitParam(name = "encoding", value = "UTF-8", description = "Encoding Param") })
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String name = req.getParameter("a");
        /* authorization succesfull */
        if (name.equals("dima1234")) {
            chain.doFilter(servletRequest,servletResponse);
        }
        else {
            try{

                /* authorization failed*/

                //RequestDispatcher dispatcher = req.getRequestDispatcher("errors/authorization_error.jsp");
                //dispatcher.forward(servletRequest,servletResponse);
                servletRequest.getRequestDispatcher("error.jsp").forward(servletRequest, servletResponse);

            }catch(Exception e){e.printStackTrace();}
        }


    }

    @Override
    public void destroy() {

    }
}
