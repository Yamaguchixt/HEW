package filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {
	
	public void init(FilterConfig filterConfig) throws ServletException{
		
	}
	
	public void doFilter(ServletRequest request,
									   ServletResponse response,
									   FilterChain chain){
	
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
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
