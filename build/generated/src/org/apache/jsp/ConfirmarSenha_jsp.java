package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ConfirmarSenha_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write(" <meta charset=\"utf-8\">\n");
      out.write(" <title>Alterar Senha</title>    \n");
      out.write("</head>\n");
      out.write("    <style>\n");
      out.write("        #campo{\n");
      out.write("            width: 400px;\n");
      out.write("            height: 200px;\n");
      out.write("            text-align: center;\n");
      out.write("           margin-top: 20%;\n");
      out.write("            font-size: 14px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write(" </style>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("        \n");
      out.write("    <center>\n");
      out.write("        <div id=\"campo\">\n");
      out.write("            <p>NOVA SENHA</p>\n");
      out.write("        <form action=\"MudarSenha\" method=\"get\">\n");
      out.write("        <input name=\"NovaSenha\" placeholder=\"Nova Senha\"><br><br>\n");
      out.write("            \n");
      out.write("            <input name=\"ConfirmaNovaSenha\" placeholder=\"Confirmação Nova Senha\"><br><br>\n");
      out.write("            <input type=\"submit\" name=\"Alterar\" value=\"Alterar\">\n");
      out.write("        </form>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
