<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" >
</head>
<body>
<main>
<img src="images/gip.gif" />
<h1>HI,Gi Kya Haal Chaal.!!😎</h1>
<h2>joke = <%=request.getParameter("joke") %></h2>
<form action="myServlet" method="post">
<input name="firstNum" type="number" placeholder="Enter  First Number : " required/>
<input name="secondNum"  placeholder="Enter second Number : " required/>
<button name="btn1" value="1">+</button>
<button name="btn1" value="2">-</button>
<button name="btn1" value="3">*</button>
<button name="btn1" value="4">/</button>
</form>
<h1>Ans = <%=request.getParameter("ans") %></h1>
</main>
</body>
</html>