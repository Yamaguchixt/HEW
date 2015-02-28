package board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.jsp.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Thread  extends Message {
	
	int threadID;
	public String title;
	ArrayList<Thread> threadList ;
	
	
	public Thread(){
		this.threadID = 0;
		this.title = "デフォルトtitle";
		threadList = new ArrayList<Thread>();
		
	}
	
	
	
	public String toString(){
		return "threadID:"+getThreadID()+"\t title:"+this.title+"\t content:"+this.content;
	}
	
	public void setThreadID(int threadID){
		this.threadID = threadID;
	}
	public int getThreadID(){
		return this.threadID;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void getTitle(JspWriter out) throws IOException{
		
		out.println("\n");
		out.println("<div class='thread'> <a href='/HEW/JSP/board/thread.jsp?threadID="+getThreadID()+"' >");
		
		out.println(this.title);
		
		out.println("</a> </div> <!-- thread title閉じる -->");
	}
	
	//rootがthread一覧をもつためのメソッド。
	public void setThread(Thread thread){
		threadList.add(thread);
	}
	
	public void getThreadList(JspWriter out) throws IOException{
		
		Iterator<Thread> iterator = threadList.iterator();
		
		while(iterator.hasNext()){
			iterator.next().getTitle(out);
		}
	}

}
