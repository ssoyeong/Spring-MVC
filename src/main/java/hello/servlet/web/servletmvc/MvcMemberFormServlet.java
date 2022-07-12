package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 컨트롤러로 요청이 들어온다
        // view(jsp)로 보내주면 된다

        String viewPath = "/WEB-INF/views/new-form.jsp";    // WEB-INF안 리소스들은 외부에서 호출 불가능
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);      // controller -> view
        dispatcher.forward(request, response);       // servlet에서 jsp호출. redirect가 아니고 서부 내부에서 다시 호춟

    }
}
