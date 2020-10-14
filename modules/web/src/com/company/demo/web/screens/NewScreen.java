package com.company.demo.web.screens;

import com.haulmont.cuba.gui.screen.*;

@UiController("demo_NewScreen")
@UiDescriptor("new-screen.xml")
@LoadDataBeforeShow
public class NewScreen extends Screen {

    @Subscribe
    public void onInit(InitEvent event) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ignore) {
        }
    }
}