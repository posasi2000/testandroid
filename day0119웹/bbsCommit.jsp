<%@ page language="java" contentType="text/html; charset=utf-8"   pageEncoding="utf-8" %>
<%@ include  file="./ssi.jsp" %>
<%@ page import="net.hb.board.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>bbsCommit.jsp</title>

</head>
<body>
  <div align="center">
     <img src="./images/main_4.jpg" width=350 height=200>
     <h4> bbsCommit.jsp화면 단독실행금지 </h4>
   	 <%
   	 //bbs.jsp문서에서 데이터 입력후 submit=전송
   	 //bbsCommit.jsp단독실행하면 에러발생, 단독실행금지 
   	 //request내장객체는 문자열로 전송
   	  Gtitle = request.getParameter("title") ;
   	  Gprice = Integer.parseInt( request.getParameter("price") );
   	  Gname = request.getParameter("name") ;
   	  Gemail = request.getParameter("email") ;
   	  
   	  System.out.println("넘어온 제목 " + Gtitle ) ;
   	  System.out.println("넘어온 가격 " + Gprice ) ;
   	  System.out.println("넘어온 이름 " + Gname ) ;
   	  System.out.println("넘어온 메일 " + Gemail ) ;
   	  System.out.println("bbsCommit.jsp 저장처리문서");
   	  //mysql msg="insert into test(title,price,wdate,name,email,hit) values('" + Gtitle + "', "+ Gprice + ", now(), 'kim', 'aa@kt.org', 0 )";
   	  //ST적용 msg="insert into test(title,price,wdate,name,email,hit) values('" + Gtitle + "', "+ Gprice + ", now(), '"+ Gname + "', '" + Gemail +"', 0 )";
   	  
   	  //msg="insert into test(title,price,wdate,name,email,hit) values(?, ?, now(), ?, ?, 0)";
   	  //System.out.println("저장 " + msg );
   	 
   	  TestBoardDAO  dao = new TestBoardDAO();
   	  TestBoardVO vo = new TestBoardVO();
   	  vo.setTitle(Gtitle);
   	  vo.setPrice(Gprice);
   	  vo.setName(Gname);
   	  vo.setEmail(Gemail);
   	  dao.dbInsert(vo);
   	  System.out.println("1-19-금요일 자바문서 + jsp문서 연결 저장성공") ;
   	  //PST = CN.prepareStatement(msg);
   	    //PST.setString(1, Gtitle);
   	    //PST.setInt(2, Gprice);
   	    //PST.setString(3, Gname);
   	    //PST.setString(4, Gemail);
   	  //int ok = PST.executeUpdate();
   	  response.sendRedirect("bbsList.jsp");
   	 %>
   	 
   
   <p>
   <a href="index.html">index</a>
   <a href="bbs.jsp">글쓰기</a>
   <a href="bbsList.jsp">전체출력</a>
  </div>
</body>
</html>



