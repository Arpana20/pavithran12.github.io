import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class setserve
 */
@WebServlet("/setserve")
public class setserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public setserve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String User=request.getParameter("user_name");
		String Roll=request.getParameter("roll_no");
		String WP=request.getParameter("wp");
		String CN=request.getParameter("cn");
		String GM=request.getParameter("gm");
		int WPmark=Integer.parseInt(WP);
		int CNmark=Integer.parseInt(CN);
		int Gmmark=Integer.parseInt(GM);
		int Total=WPmark+CNmark+Gmmark;
		String Response="<html><body><h2>Thank You!!</h2><h3>Name</h3>"+User+"<h2>Roll_no</h2>"+Roll+"<h2>Your Total is</h2>"+Total+"</body></html>";
		PrintWriter pw=response.getWriter();
		pw.write(Response);
		
				
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
