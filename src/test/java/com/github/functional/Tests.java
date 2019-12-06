package com.github.functional;

import com.github.exception.LoginPage;
import com.github.exception.TestBase;
import org.testng.annotations.Test;

public class Tests extends TestBase {
    @Test(priority=1)
    public void testGenderlInformation() throws Exception {

        LoginPage.setUserName("admin");
        LoginPage.setPassword("Admin123");
        LoginPage.clickLogin();


    }
}
