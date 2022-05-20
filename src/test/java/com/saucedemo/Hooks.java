package com.saucedemo;

import com.cucumber.listener.Reporter;
import com.saucedemo.propertyreader.ReadProperty;
import com.saucedemo.utility.Utilites;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks extends Utilites {

    @Before
    public void setup(){
        selectBrowser(ReadProperty.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            String screenShotPath = Utilites.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
