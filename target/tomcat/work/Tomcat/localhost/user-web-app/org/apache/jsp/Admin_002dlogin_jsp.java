/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2025-01-06 08:34:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_002dlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\"> \r\n");
      out.write("\r\n");
      out.write(" <head> \r\n");
      out.write("\r\n");
      out.write("  <meta charset=\"UTF-8\"> \r\n");
      out.write("\r\n");
      out.write("  <title>CodePen - Animated Login Form using Html &amp; CSS Only</title> \r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"CSS/Admin-login.css\"> \r\n");
      out.write("\r\n");
      out.write(" </head> \r\n");
      out.write("\r\n");
      out.write(" <body> <!-- partial:index.partial.html --> \r\n");
      out.write("\r\n");
      out.write("  <section> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> <span></span> \r\n");
      out.write("    <script src=\"JS/Admin-login.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"signin\"> \r\n");
      out.write("        <div class=\"content\"> \r\n");
      out.write("          <h2>Admin-login</h2> \r\n");
      out.write("          <h2>Welcome to my LMS</h2> \r\n");
      out.write("      \r\n");
      out.write("          <form action=\"adminLogin\" method=\"post\" onsubmit=\"return validateForm()\">                \r\n");
      out.write("            <div class=\"form\"> \r\n");
      out.write("      \r\n");
      out.write("              <div class=\"inputBox\"> \r\n");
      out.write("                <input type=\"text\" name=\"email\" required> \r\n");
      out.write("                <i>email</i> \r\n");
      out.write("              </div> \r\n");
      out.write("      \r\n");
      out.write("              <div class=\"inputBox\"> \r\n");
      out.write("                <input type=\"password\" name=\"password\" required> \r\n");
      out.write("                <i>Password</i> \r\n");
      out.write("              </div>\r\n");
      out.write("      \r\n");
      out.write("              <div class=\"inputBox\"> \r\n");
      out.write("                <input type=\"submit\" value=\"Login\"> \r\n");
      out.write("              </div>\r\n");
      out.write("      \r\n");
      out.write("            </div> \r\n");
      out.write("          </form>\r\n");
      out.write("      \r\n");
      out.write("          <div class=\"links\">\r\n");
      out.write("            <a href=\"#\">Forgot Password</a> \r\n");
      out.write("            <a href=\"#\">Signup</a> \r\n");
      out.write("          </div> \r\n");
      out.write("      \r\n");
      out.write("        </div> \r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("   </div> \r\n");
      out.write("\r\n");
      out.write("  </section> <!-- partial --> \r\n");
      out.write("\r\n");
      out.write(" </body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
