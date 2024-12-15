package myPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet
 */
@WebServlet("/myServlet")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  String[] joke = {
			"Hello, My name is Deepak",
			"How do you do.???",
			"How You Doing in??"
	};       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("firstNum");
		String str2 = request.getParameter("secondNum");
		String str3 = request.getParameter("btn1");
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int ans;
		
		if(str3.equals("1")) {
			ans = num1 + num2;
		}
		else if(str3.equals("2")) {
			ans = num1 - num2;
		}
		else if(str3.equals("3")) {
			ans = num1 * num2;
		}
		else{
			ans = num1 / num2;
		}
		
		int randomIndex = (int)(Math.random() * joke.length);
		String randomJoke = joke[randomIndex];
//		response.getWriter().append("The Final Answer is : " + ans);
		response.sendRedirect("NewFile.jsp?ans="+ans+"&joke= "+randomJoke);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
