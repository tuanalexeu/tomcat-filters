package com.alekseytyan;

import javax.servlet.*;
import java.io.IOException;

public class MyCompressionFilter implements Filter {
    public void init(FilterConfig cfg) {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        CompressionResponseWrapper wrappedResp = new CompressionResponseWrapper(response);
        chain.doFilter(request, wrappedResp);
        // do compression logic here
    }

    public void destroy() {

    }
}