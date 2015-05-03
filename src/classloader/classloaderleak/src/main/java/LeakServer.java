import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LeakServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	
//	private static final String STATICNAME = "Simple";
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//	throws ServletException, IOException {
//	}
		
	public LeakServer() {
	}

	private static final String STATICNAME = "This leaks!";
	private static final Level CUSTOMLEVEL = new Level("test", 550) {
	}; // anon class!

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Logger.getLogger("test").log(CUSTOMLEVEL, "doGet called");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
