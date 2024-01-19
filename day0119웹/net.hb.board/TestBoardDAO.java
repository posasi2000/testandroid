package net.hb.board;

import java.sql.Connection;
import java.sql.*;

public class TestBoardDAO {
	  Connection CN; //db서버연결정보, 명령어생성할때 참조
	  Statement ST; //명령어생성 ST = CN.createStatement()
	  PreparedStatement PST; //속도가빠름 PST = CN.prepareStatement("insert~/update~")
	  ResultSet RS; //select조회한결과 RS=ST.executeQuery("select~~")
	 
	   String Gtitle;
	   int Gnum, Gprice, Gtotal, GStotal ;
	   java.util.Date  Gwdate;
	   String msg = ""; //database=DB인식하는 언어 SQL
			   
	   String Gname, Gemail ;
	   int Ghit;
	
   public TestBoardDAO() { 
	  CN=DB.getConnection() ; //ssi.jsp문서 훨씬 편하고 쉽네요 
   }//dao=data access object 
	
   public void dbInsert( ) { //함수중복 = overLoading
	try {
	  //bbsCommit.jsp문서
	  msg="insert into test(title,price,wdate,name,email,hit) values(?,?,now(),?,?,0)";       
	  PST = CN.prepareStatement(msg);
 	    PST.setString(1, Gtitle);
 	    PST.setInt(2, Gprice);
 	    PST.setString(3, Gname);
 	    PST.setString(4, Gemail);
 	    PST.executeUpdate(); //진짜저장
	 }catch(Exception e){System.out.println("test저장실패"); }
   }//end
   
   public void dbInsert( TestBoardVO vo) { //함수중복 = overLoading
	 try {
	  msg="insert into test(title,price,wdate,name,email,hit) values(?,?,now(),?,?,0)";       
	  PST = CN.prepareStatement(msg);
	    PST.setString(1, vo.getTitle());
	    PST.setInt(2, vo.getPrice());
	    PST.setString(3, vo.getName());
	    PST.setString(4, vo.getEmail());
	    PST.executeUpdate(); //진짜저장 
	    System.out.println("1-19-금요일 자바문서에서 test저장 성공");
	 }catch(Exception e){System.out.println("test저장실패"); }   
   }//end
}//class END





