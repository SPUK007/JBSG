package com.examples.cucumber;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStepDefs {

    private WebDriver webDriver;
    private String baseUrl = "https://www.amazon.co.uk";


    @Given("I have opening balance beer cans")
    public void i_have_opening_balance_beer_cans() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        System.setProperty("webdriver.chrome.driver","C:/Users/WinUser/IdeaProjects/WebDrivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

    }

    @And ("I have drunk processed beer cans")
    public void i_have_drunk_processed_beer_cans(){
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get(baseUrl);

    }

    @When ("I go to my fridge")
    public void i_go_to_my_fridge(){
        WebElement googleTextBox = webDriver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        googleTextBox.sendKeys("Iphone X 256");

    }
    @Then ("I should have in stock beer cans")
    public void i_should_have_in_stock_beer_cans(){
        WebElement searchButton = webDriver.findElement(By.xpath("//*[@id=\'nav-search-submit-text\']/input"));
        searchButton.click();
        WebElement searchResult = webDriver.findElement(By.id("search"));
        System.out.println("Search Result : "+ searchResult);
        webDriver.close();
        if (webDriver != null) {
            webDriver.quit();
        }

    }

}
