package board;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Message {
		  int ID;
		  Message responseTo;
		  int responsetToID;
		  int level;
		  String content;
		  ArrayList<Message> responseList;
		  
		  //コンストラクタ
		  public Message(){

			  this.ID = 0;
			  this.level = 0;
			  this.content = "";
			  this.responseList = new ArrayList<Message>();
		  }
		  
		  public String toString(){
			  return "ID:"+this.ID+"responseTo:"+this.responseTo+"content:"+this.content;
		  }
		  
		  
		  
		  public void setID(int ID){
			  this.ID = ID;
			  return;
		  }
		  public int getID (){
			  return this.ID;
		  }
		  
		  
		  
		  public void  setResponseTo(Message responseTo){
			  this.responseTo = responseTo;
		  }
		  public Message getResponseTo(){
			  return this.responseTo;
		  }
		  
		  public void setResponseToID(int ID){
			  this.responsetToID = ID;
		  }
		  
		  public int getResponseToID(){
			  return this.responsetToID;
		  }
		  
 		  public void setLevel(int level){
			  this.level = this.responseTo.getLevel()+1;
			  return;
		  }
 		  public int getLevel(){
 			  return this.level;
 		  }

 		  public void setContent(String content){
			  this.content = content;
			  return;
		  }
		  
		  public void setMessage(Message message){
			 
			  //自分宛ての返信だったら、自分のListに追加
			  if(this.ID == message.getResponseToID()){
				  responseList.add(message);
				  
				  //子に自分を親として登録させておく。
				  message.setResponseTo(this);
				  //自身の階層に+１した階層をセットする。
				  message.setLevel(this.level++);
			  }
			  
			  //自分宛てでなかったら、自分への返信listに追加するように命令する
			  if(responseList.size() > 0){
				  Iterator<Message> iterator = responseList.iterator();
				  while(iterator.hasNext()){
					  
                       iterator.next().setMessage(message);
                  }
			  }
		  }	  
		  //必ず既存のMessageに返信してもらうためのメソッド。
		  public boolean isThere(int ID){
			  if(this.ID == ID){return true;}
			  Iterator<Message> iterator = responseList.iterator();
			  while(iterator.hasNext()){
				  if( ((Message) iterator).isThere(ID)){return true;}
			  }
			  return false;
		  }
		  
		  //contentを表示させるためのメソッド
		  public void getContent(PrintStream out){
			  
			  Iterator<Message> iterator = this.responseList.iterator();
			 
			  out.println("<div class='level"+this.level+"'>");
			  out.println("\t<p class='levele"+this.level+"content'>");
			  out.println(this.content);
			  out.println("\t</p>");
			  
			  while(iterator.hasNext()){
				   iterator.next().getContent(out);
			  }
			  out.println("</div>");
		  }
		  

}
