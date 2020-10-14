package com.company.demo.web;

import com.haulmont.cuba.web.AppUI;
import com.vaadin.server.VaadinRequest;

public class CustomAppUI extends AppUI {

    @Override
    protected void init(VaadinRequest request) {
        super.init(request);

        getLoadingIndicatorConfiguration().setFirstDelay(0);
    }
}