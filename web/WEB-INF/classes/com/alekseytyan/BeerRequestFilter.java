package com.alekseytyan;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class BeerRequestFilter implements Filter {

    private FilterConfig fc;

    @Override
    public void init(FilterConfig config) throws ServletException {
        this.fc = config;
    }

    @Override
    public void doFilter(ServletRequest req,
                         ServletResponse resp,
                         FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpReq = (HttpServletRequest) req;
        String name = httpReq.getRemoteUser();
        if (name != null) {
            fc.getServletContext().log("User " + name + " is updating");
        }
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
        // do cleanup stuff
    }
}