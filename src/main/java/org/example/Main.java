package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();

        WebDriver driver;
        driver = new EdgeDriver();

        driver.get("file:///C:/Users/rahma/OneDrive/Desktop/indexSelectors.html");



    }
}