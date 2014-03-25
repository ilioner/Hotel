<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>NumberGuess</title>
</head>
<body>

<%@ page import="java.util.*" %>

<%! int answer=0; %>
<%! int numberGuesses=0; %>

<% String guess=request.getParameter("guess");
if(guess==null) { %>
Welcome to the Number Guess game.<p>
<% answer=Math.abs(new Random().nextInt()%100)+1;
numberGuesses=0;
} else { 
    int value=Integer.parseInt(guess);
    if(value==answer) { %>
        Congratulation! You got it.<br>
        And after just <%= numberGuesses %> tries.<p>
        Care to <a href="NumberGuess.jsp">try again</a>?<p>
<% } else { %>
Good guess, but nope. Try
    <% numberGuesses++;
    if(value<answer) { %>
        <b>higher.</b>.<p>
    <% } else if (value>answer) { %>
        <b>lower</b>.<p>
    <% }
    }
} %>
I'm thinking of a number between 1 and 100.<p>

<form method=get action="NumberGuess.jsp">
What's your guess? <input type=text name=guess>
<input type=submit value="Submit">
</form>

<form method=get action="NumberGuess.jsp">
What's your guess? <input type=text name=guess>
<input type=submit value="Submit">
</form>

<form action="form_action.asp" method="get">
  <p>First name: <input type="text" name="fname" /></p>
  <p>Last name: <input type="text" name="lname" /></p>
  <input type="submit" value="Submit" />
</form>


</body>
</html>