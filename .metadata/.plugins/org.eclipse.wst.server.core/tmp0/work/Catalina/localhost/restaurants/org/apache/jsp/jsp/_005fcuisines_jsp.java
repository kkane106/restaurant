/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-08-31 16:56:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _005fcuisines_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<ul id=\"cuisines\">\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t<a href=\"getCuisine.do?cuisine=American\">\r\n");
      out.write("\t\t\t<figure>\r\n");
      out.write("\t\t\t\t<img src=\"imgs/american.jpg\">\r\n");
      out.write("\t\t\t\t<figcaption><p>American</p></figcaption>\r\n");
      out.write("\t\t\t</figure>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t<a href=\"getCuisine.do?cuisine=Chinese\">\r\n");
      out.write("\t\t\t<figure>\r\n");
      out.write("\t\t\t\t<img src=\"imgs/chinese.jpg\">\r\n");
      out.write("\t\t\t\t<figcaption><p>Chinese</p></figcaption>\r\n");
      out.write("\t\t\t</figure>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t<a href=\"getCuisine.do?cuisine=Italian\">\r\n");
      out.write("\t\t\t<figure>\r\n");
      out.write("\t\t\t\t<img src=\"imgs/italian.jpg\">\r\n");
      out.write("\t\t\t\t<figcaption><p>Italian</p></figcaption>\r\n");
      out.write("\t\t\t</figure>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t<a href=\"getCuisine.do?cuisine=Mexican\">\r\n");
      out.write("\t\t\t<figure>\r\n");
      out.write("\t\t\t\t<img src=\"imgs/mexican.jpg\">\r\n");
      out.write("\t\t\t\t<figcaption><p>Mexican</p></figcaption>\r\n");
      out.write("\t\t\t</figure>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t<a href=\"getCuisine.do?cuisine=Pizza\">\r\n");
      out.write("\t\t\t<figure>\r\n");
      out.write("\t\t\t\t<img src=\"imgs/pizza.jpg\">\r\n");
      out.write("\t\t\t\t<figcaption><p>Pizza</p></figcaption>\r\n");
      out.write("\t\t\t</figure>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t<a href=\"getCuisine.do?cuisine=Sushi\">\r\n");
      out.write("\t\t\t<figure>\r\n");
      out.write("\t\t\t\t<img src=\"imgs/sushi.jpg\">\r\n");
      out.write("\t\t\t\t<figcaption><p>Sushi</p></figcaption>\r\n");
      out.write("\t\t\t</figure>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t<li>\r\n");
      out.write("\t\t<a href=\"getCuisine.do?cuisine=Thai\">\r\n");
      out.write("\t\t\t<figure>\r\n");
      out.write("\t\t\t\t<img src=\"imgs/thai.jpg\">\r\n");
      out.write("\t\t\t\t<figcaption><p>Thai</p></figcaption>\r\n");
      out.write("\t\t\t</figure>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t<a href=\"getCuisine.do?cuisine=Indian\">\r\n");
      out.write("\t\t\t<figure>\r\n");
      out.write("\t\t\t\t<img src=\"imgs/indian.jpg\">\r\n");
      out.write("\t\t\t\t<figcaption><p>Indian</p></figcaption>\r\n");
      out.write("\t\t\t</figure>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t\t<li>\r\n");
      out.write("\t\t<a href=\"getCuisine.do?cuisine=Mediterranean\">\r\n");
      out.write("\t\t\t<figure>\r\n");
      out.write("\t\t\t\t<img src=\"imgs/mediterranean.jpg\">\r\n");
      out.write("\t\t\t\t<figcaption><p>Mediterranean</p></figcaption>\r\n");
      out.write("\t\t\t</figure>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</li>\r\n");
      out.write("</ul>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}