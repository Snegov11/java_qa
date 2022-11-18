package org.java.qa.selenium.group.tests;

import org.java.qa.selenium.group.model.GroupData;
import org.testng.annotations.*;

public class CreateGroupTests extends TestBase {

    @Test
    public void addNewGroup() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().createNewGroup();
        app.getGroupHelper().fillGroup(new GroupData("Test2", "Test2", "Test2"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}