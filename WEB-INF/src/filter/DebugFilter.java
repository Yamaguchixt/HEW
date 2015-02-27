package filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DebugFilter implements Filter {
	
	public void init(FilterConfig filterConfig) throws ServletException{
		
	}
	
	public void doFilter(ServletRequest request,
									   ServletResponse response,
									   FilterChain chain) throws UnsupportedEncodingException{
		
		request.setCharacterEncoding("utf-8");
		
		//System.out.println("--------DebugFilterがrequestのParametersを表示します-----------");
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()){
			String key = names.nextElement();
			String[] values = request.getParameterValues(key);
			for(String i :values){
				System.out.println(key +" = "+i);
			}
		}
		try {
			chain.doFilter(request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void destroy(){
		
	}

}