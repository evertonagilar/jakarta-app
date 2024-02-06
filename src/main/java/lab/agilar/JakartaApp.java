package lab.agilar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Serial;
import java.util.logging.Logger;

@WebServlet(value = "JakartaAppServlet", urlPatterns = "/index.html")
public class JakartaApp extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(JakartaApp.class.getName());

    @Override
    public void init() throws ServletException {
        super.init();
        LOGGER.info("Init " + JakartaApp.class.getName());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.info("Renderizando /WEB-INF/jsp/jakartaapp.jsp");
        request.getRequestDispatcher("/WEB-INF/jsp/jakartaapp.jsp").forward(request, response);
    }

    @Override
    public void destroy() {
        super.destroy();
        LOGGER.info("Destroy " + JakartaApp.class.getName());
    }

}
