package tests.day03;

import com.microsoft.playwright.*;

import java.awt.*;

public class P01_elementBilgisiAlma {
    public static void main(String[] args) {

        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int widht = screensize.width;
        int height = screensize.height;
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.setViewportSize(widht, height);
        page.navigate("https://www.testotomasyonu.com");
        // System.out.println(page.textContent(".heading-lg"));

        Locator topText = page.getByText(" Top Selling Products ");
        System.out.println(topText.innerText());

        // System.out.println(page.getByText(" Top Selling Products "));

        page.close(); browser.close(); playwright.close();


    }
}
