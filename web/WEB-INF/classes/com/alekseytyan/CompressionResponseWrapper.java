package com.alekseytyan;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class CompressionResponseWrapper extends HttpServletResponseWrapper {
    public CompressionResponseWrapper(ServletResponse response) {
        super((HttpServletResponse) response);
    }
}
