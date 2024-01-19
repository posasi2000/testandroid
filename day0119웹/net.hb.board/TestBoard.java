package net.hb.board;

import java.sql.Connection;
import java.sql.*;

public class TestBoard {
    //ssi.jsp단독실행이 가능하나 TestBoard.java단독실행불가 
	public TestBoard() {  } //생성자 
	
	public Connection getConnection() {
	 Connection CN = null ;
		try{
		  //순서1 db데이터베이스 드라이브연결
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("mysql드라이브 연결성공  ");
		   
		  //순서2 db데이터베이스 서버정보주소및포트 계정id/pwd
		  String url="jdbc:mysql://localhost:3306/board";
		  CN=DriverManager.getConnection(url ,"root","1234");
		  System.out.println("mysql서버정보및 id,pwd 연결성공  ");
		}catch(Exception ex){ System.out.println("db연결 에러발생 " + ex);  }
	 return CN;
	}//end
	
}//class END

