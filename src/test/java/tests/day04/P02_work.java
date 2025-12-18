package tests.day04;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.awt.*;

import static com.microsoft.playwright.options.AriaRole.TEXTBOX;
public class P02_work {
    public static void main(String[] args) throws InterruptedException {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.setViewportSize(width, height);
        page.navigate("https://getir.com/");


        Locator biscolata = page.getByTestId("text").getByAltText("Biscolata");
        biscolata.click();
        Thread.sleep(3000);
        page.close();
        browser.close();
        playwright.close();





    }
}
