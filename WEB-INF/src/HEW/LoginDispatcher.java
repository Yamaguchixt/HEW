package HEW;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

//login.jspから渡されたlogin情報に基づいて、メンバーページか再入力かをdispatchする。
public class LoginDispatcher extends HttpServlet  {
	
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		String ID = request.getParameter("ID");
		String password = request.getParameter("password");
		
		RequestDispatcher formDispatcher = request.getRequestDispatcher("JSP/login/login.jsp");

		//フォーマットにそっているかチェック
		if(!FormatChecker.isValid(ID,MemberInformation.ID)){
			request.setAttribute("errorMessage","IDの書式が違います");
			formDispatcher.forward(request, response);
			return;
		}
		
		if(!FormatChecker.isValid(password,MemberInformation.PASSWORD)){
			request.setAttribute("errorMessage","passwordの書式が違います");
			formDispatcher.forward(request, response);
		}
		//Formatcのチェックが済んだので、有効性をDBに確認。
		try {
			if(DBinterface.isMember(ID,password)){
				request.getRequestDispatcher("JSP/member/member_home.jsp").forward(request,response);
				return ;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("errorMessage", "ID又はpasswordが違います");
		formDispatcher.forward(request,response);
		return;
	}
}
