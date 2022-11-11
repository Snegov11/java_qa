package org.java.qa.selenium.tests;

import org.java.qa.selenium.model.GroupData;
import org.testng.annotations.*;

public class CreateBookTests extends TestBase {

    @Test
    public void addNewGroup() throws Exception {
        app.getGroupHelper().goToGroupPage();
        app.getGroupHelper().createNewGroup();
        app.getGroupHelper().fillGroup(new GroupData("Test2", "Test2", "Test2"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}