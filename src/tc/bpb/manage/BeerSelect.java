package tc.bpb.manage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeerSelect extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// resp.setContentType("text/html");
		// PrintWriter out = resp.getWriter();
		// out.println("Beer slection Advance</br>");
		// String c = req.getParameter("color1");
		// out.println("color1=" + c);
		// c = req.getParameter("color2");
		// out.println("color2=" + c);
		String developer = getServletConfig().getInitParameter("Developer");
		String dev = getServletContext().getInitParameter("¿ª·¢Õß");
		String c1 = req.getParameter("color1");
		String c2 = req.getParameter("color2");
		BeerExpert bee = new BeerExpert();
		List<String> list = bee.getBrands(c1, c2);
		list.add(developer);
		list.add(dev);
		req.setAttribute("style", list);
		RequestDispatcher view = req.getRequestDispatcher("result.jsp");
		view.forward(req, resp);
	}
}
