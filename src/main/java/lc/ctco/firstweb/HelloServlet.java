package lc.ctco.firstweb;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yelena.pchelinceva on 12/18/2018.
 */
@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
   @Inject
    private MyInfo myInfo;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullName = request.getParameter("fullname");
        String secret = request.getParameter("secret");
        myInfo.setFullName(fullName);
        myInfo.setSecret(secret);

        //        try (PrintWriter out = response.getWriter()) {
//       out.println("Hello from servlet");
//            out.println(fullName);
//            out.println(secret);
//   }

      request.getRequestDispatcher("/result.jsp").include(request,response); ;
    }
}
