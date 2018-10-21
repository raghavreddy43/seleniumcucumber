/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package step_definitions;

import cucumber.api.java.en.Given;
import static java.time.Clock.system;
import org.openqa.selenium.chrome.ChromeDriver;
import static pageobjects.BaseClass.driver;

/**
 *
 * @author rag.reddy
 */
public class BillingLogin {

    /**
     *
     * @throws step_definitions.execption
     */
    @Given("^I open billing login web page$")
    public void i_open_billing_login_web_page() {
    System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver");
    driver = new ChromeDriver();
    driver.get("https://activbill.test.costcutter.com");
    }
  
    }

