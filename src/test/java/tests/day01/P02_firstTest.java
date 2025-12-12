package tests.day01;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class P02_firstTest {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser =  playwright.chromium().launch( new BrowserType.LaunchOptions().setHeadless(true));
        // setHeadless(true): test hiç pencere açılmadan tamamlanır
        // setHeadless(false): test browser açılarak tamamlanır
        Page page = browser.newPage();
        page.navigate("https://www.babayigit.net/test");
        System.out.println(page.title());

        page.close();
        browser.close();
        playwright.close();
    }
}
