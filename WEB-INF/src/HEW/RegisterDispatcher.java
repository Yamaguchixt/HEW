package HEW;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

//register_formからの遷移を確認。web.xmlのmappingは有効。
//formからの入力を確認して、DBinterfaceに登録させ、loginか再登録へdispatchさせる。

public class RegisterDispatcher extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		String ID = request.getParameter("ID");
		String password = request.getParameter("password");
		String summonerName = request.getParameter("summonerName");
		String sex = request.getParameter("sex");
		
		//以下行われるチェックで問題が発見された場合に遷移させるDispatcherをあらかじめ定義しておく
		RequestDispatcher formDispatcher = request.getRequestDispatcher("JSP/login/register_form.jsp");
		//step1 書式チェック　
		//正規表現で入力が適正な文字列か確認する
		if(!FormatChecker.isValid(ID,MemberInformation.ID)){
			request.setAttribute("errorMessage","IDの書式を確認してください");
			formDispatcher.forward(request, response);
			return ;
		}
		if(!FormatChecker.isValid(password,MemberInformation.PASSWORD)){
			request.setAttribute("errorMessage","passwordの書式を確認してください");
			formDispatcher.forward(request, response);
			return;
		}
		if(!FormatChecker.isValid(summonerName,MemberInformation.SUMMONERNAME)){
			request.setAttribute("errorMessage","summonerNameの書式を確認してください");
			formDispatcher.forward(request, response);
			return;
		}
		
		//step2 既存チェック
		//入力されたIDが既存のmemberとconflictしないか確認する
		try {
			if(DBinterface.isThere(ID)){
				request.setAttribute("errorMessage","そのIDは既に使用されています");
				formDispatcher.forward(request, response);
				return;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//step3 登録
		try{
			DBinterface.register(ID, password, summonerName, sex);
			request.getRequestDispatcher("JSP/login/login.jsp").forward(request, response);
			return;
		}catch (SQLException e){
			e.printStackTrace();
		}
	}	
	
	//register_formのIDのinputをajaxの非同期でうけとり、既存かどうかonChangeで解答していく。
	public void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException,IOException{
		String ID = request.getParameter("ID");
		String hashedID = ID;
		boolean result = true;
		try {
			 result = DBinterface.isThere(hashedID);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int resultInt ;
		if(result){resultInt = 1;}
		else{resultInt=0;}
		
		out.println(resultInt);
	}

	
	
	
}
