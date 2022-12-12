package org.java.qa.selenium.group.tests;

import org.java.qa.selenium.group.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

public class CreateGroupTests extends TestBase {

    @Test
    public void addNewGroup() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createGroup(new GroupData("Test2", "Test2", "Test2"));
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before+1 );
    }

}