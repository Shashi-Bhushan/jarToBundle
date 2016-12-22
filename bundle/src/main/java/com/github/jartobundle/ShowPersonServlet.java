package com.github.jartobundle;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by shabhushan on 12/22/2016.
 */
@Component(
        label = "Show Person Information Servlet"
)
@Service(Servlet.class)
@Properties({
        @Property(name = "sling.servlet.paths", value = "/bin/showPersonInfo"),
        @Property(name = "sling.servlet.methods", value = "GET")
})
public class ShowPersonServlet extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.write("TODO: Show Person Info");
    }
}
