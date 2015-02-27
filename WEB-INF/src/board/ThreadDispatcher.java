package board;

import HEW.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;

//thread.jspからthreadやmessageの作成を依頼される。
public class ThreadDispatcher extends HttpServlet  {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		/*
		if(request.getParameter("thread").equals("true")){
		
			int threadID = 0;
			String threadTitle = null;
			String content = null;
		
			threadTitle = request.getParameter("threadtitle");
			content = request.getParameter("threadcontent");
			
			try {
				threadID = DBinterface.getMaxID("thread");
				System.out.println("MAXIDは:"+threadID);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				DBinterface.createThread(threadID, threadTitle, content);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			request.getRequestDispatcher("JSP/board/threadlist.jsp").forward(request,response);
			return;
		}//thread作成閉じる
	*/
	
		if(request.getParameter("message").equals("true")){
			int messageID =0;
			//int threadID = (int)request.getAttribute("threadID");
			int threadID = 1;
			int responseTo = Integer.parseInt(request.getParameter("responseTo"));
			String content = request.getParameter("content");
		
		
			try {
			messageID = DBinterface.getMaxID("message");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println(content);
			try {
				DBinterface.createMessage(messageID,threadID,responseTo,content);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			request.getRequestDispatcher("JSP/board/thread.jsp?threadID="+threadID).forward(request,response);
			return;
	
			
		}
	}
	
}