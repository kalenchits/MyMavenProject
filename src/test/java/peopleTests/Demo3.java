package peopleTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        driver.get("https://google.com");
        System.out.println("Заголовок страницы " + driver.getTitle());
        System.out.println("URL страницы " + driver.getCurrentUrl());

        driver.navigate().to("http://ya.ru");
        driver.navigate().back();
        driver.navigate().refresh();

        driver.close();

    }
}
