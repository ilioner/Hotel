package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class NumberGuess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int answer=0; 
 int numberGuesses=0; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>NumberGuess</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
 String guess=request.getParameter("guess");
if(guess==null) { 
      out.write("\n");
      out.write("Welcome to the Number Guess game.<p>\n");
 answer=Math.abs(new Random().nextInt()%100)+1;
numberGuesses=0;
} else { 
    int value=Integer.parseInt(guess);
    if(value==answer) { 
      out.write("\n");
      out.write("        Congratulation! You got it.<br>\n");
      out.write("        And after just ");
      out.print( numberGuesses );
      out.write(" tries.<p>\n");
      out.write("        Care to <a href=\"NumberGuess.jsp\">try again</a>?<p>\n");
 } else { 
      out.write("\n");
      out.write("Good guess, but nope. Try\n");
      out.write("    ");
 numberGuesses++;
    if(value<answer) { 
      out.write("\n");
      out.write("        <b>higher.</b>.<p>\n");
      out.write("    ");
 } else if (value>answer) { 
      out.write("\n");
      out.write("        <b>lower</b>.<p>\n");
      out.write("    ");
 }
    }
} 
      out.write("\n");
      out.write("I'm thinking of a number between 1 and 100.<p>\n");
      out.write("\n");
      out.write("<form method=get action=\"NumberGuess.jsp\">\n");
      out.write("What's your guess? <input type=text name=guess>\n");
      out.write("<input type=submit value=\"Submit\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<form method=get action=\"NumberGuess.jsp\">\n");
      out.write("What's your guess? <input type=text name=guess>\n");
      out.write("<input type=submit value=\"Submit\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<form action=\"form_action.asp\" method=\"get\">\n");
      out.write("  <p>First name: <input type=\"text\" name=\"fname\" /></p>\n");
      out.write("  <p>Last name: <input type=\"text\" name=\"lname\" /></p>\n");
      out.write("  <input type=\"submit\" value=\"Submit\" />\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
