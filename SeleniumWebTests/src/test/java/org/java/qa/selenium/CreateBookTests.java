package org.java.qa.selenium;

import org.testng.annotations.*;

public class CreateBookTests extends TestBase {

    @Test
    public void addNewGroup() throws Exception {
        goToGroupPage();
        createNewGroup();
        fillGroup(new GroupData("Test2", "Test2", "Test2"));
        submitGroupCreation();
        returnToGroupPage();
    }

}