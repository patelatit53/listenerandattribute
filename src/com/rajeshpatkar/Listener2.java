package com.rajeshpatkar;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class Listener2 implements ServletRequestAttributeListener {

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println(
                "Attribute "+
                srae.getName()+
                " Added to Request Object with value "
                + srae.getValue()
        );
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println(
                "Attribute "+
                srae.getName()+
                " removed from Request Object it's value is " +
                srae.getValue()
        );
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println(
                "Attribute in Request Scope namely "+
                srae.getName()+
                " replaced with value "
                + srae.getValue()
        );
    }
}