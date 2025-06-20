/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2025-01-05 12:03:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_002duser_002dmanagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>User Management</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"CSS/user-management.css\">\r\n");
      out.write("    <script>\r\n");
      out.write("        function showForm(formId) {\r\n");
      out.write("            // Hide all forms\r\n");
      out.write("            document.getElementById(\"create-user-form\").style.display = 'none';\r\n");
      out.write("            document.getElementById(\"update-user-form\").style.display = 'none';\r\n");
      out.write("            document.getElementById(\"delete-user-form\").style.display = 'none';\r\n");
      out.write("\r\n");
      out.write("            // Show selected form\r\n");
      out.write("            document.getElementById(formId).style.display = 'block';\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <header class=\"header\">\r\n");
      out.write("            <h1>User Management</h1>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"button-group\">\r\n");
      out.write("            <button class=\"button\" onclick=\"showForm('create-user-form')\">Create User</button>\r\n");
      out.write("            <button class=\"button\" onclick=\"showForm('update-user-form')\">Update User</button>\r\n");
      out.write("            <button class=\"button\" onclick=\"showForm('delete-user-form')\">Delete User</button>\r\n");
      out.write("            <!-- View Users Button now directs to the list action -->\r\n");
      out.write("            <a href=\"userManagement?action=list\" class=\"button\">View Users</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Forms for creating, updating, and deleting users -->\r\n");
      out.write("        <div id=\"create-user-form\" class=\"form-container\">\r\n");
      out.write("            <h2>Create User</h2>\r\n");
      out.write("            <form action=\"userManagement\" method=\"post\">\r\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"add\">\r\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"Name\" required>\r\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"Email\" required>\r\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Password\" required>\r\n");
      out.write("                <textarea name=\"profileDetails\" placeholder=\"Profile Details\" required></textarea>\r\n");
      out.write("                <button type=\"submit\">Create User</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"update-user-form\" class=\"form-container\">\r\n");
      out.write("            <h2>Update User</h2>\r\n");
      out.write("            <form action=\"userManagement\" method=\"post\">\r\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"update\">\r\n");
      out.write("                <input type=\"number\" name=\"id\" placeholder=\"User ID\" required>\r\n");
      out.write("                <input type=\"text\" name=\"name\" placeholder=\"Name\" required>\r\n");
      out.write("                <input type=\"email\" name=\"email\" placeholder=\"Email\" required>\r\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\"Password\" required>\r\n");
      out.write("                <textarea name=\"profileDetails\" placeholder=\"Profile Details\" required></textarea>\r\n");
      out.write("                <button type=\"submit\">Update User</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"delete-user-form\" class=\"form-container\">\r\n");
      out.write("            <h2>Delete User</h2>\r\n");
      out.write("            <form action=\"userManagement\" method=\"post\">\r\n");
      out.write("                <input type=\"hidden\" name=\"action\" value=\"delete\">\r\n");
      out.write("                <input type=\"number\" name=\"id\" placeholder=\"User ID\" required>\r\n");
      out.write("                <button type=\"submit\">Delete User</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"user-list\">\r\n");
      out.write("            <!-- Optional: List of users or other user management features can go here -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
