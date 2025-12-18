package tests.day04;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.awt.*;

import static com.microsoft.playwright.options.AriaRole.TEXTBOX;

public class P01_locators {

    public static void main(String[] args) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         int widht = screenSize.width;
         int height = screenSize.height;

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://getir.com/");
        System.out.println("title: " + page.title());

        // getByText
        Locator loginText = page.getByText("Giriş yap veya kayıt ol");
        System.out.println("1. text: " + loginText.innerText());

        //getByRole
        Locator phoneNumber = page.getByRole(TEXTBOX, new Page.GetByRoleOptions().setName("Telefon Numarası"));
        System.out.println("2. phone number: " + phoneNumber.innerText());

        //getByLabel
        Locator phoneContinueButton = page.getByLabel("login button");
        System.out.println("3. phoneContinueButton: " + phoneContinueButton.innerText());


    }
}
