// 자바 코드를 넣는 곳
 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <%@ page import="hello.servlet.domain.member.Member" %>
 <%@ page import="hello.servlet.domain.member.MemberRepository" %>
 <%
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("MemberSaveServlet.service");
    String username = request.getParameter("username");     // html의 데이터 읽어오기
    Integer age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);

 %>
  <html>
  <head>
      <title>Title</title>
  </head>
<body>
성공
<ul>
    <li>id=<%=member.getId()%></li>
    <li>username=<%=member.getUsername()%></li>
    <li>age=<%=member.getAge()%></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>