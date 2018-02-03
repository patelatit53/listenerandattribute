package com.rajeshpatkar;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class Listener1 implements ServletRequestListener {
    static int count = 0;
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request is about to be destroyed "+ sre.getServletRequest().getAttribute("id"));
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request Object has been created and will be given id "+ count);
        sre.getServletRequest().setAttribute("id",count++);
    }
}