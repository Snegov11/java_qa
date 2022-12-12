package org.java.qa.selenium.group.tests;

import org.java.qa.selenium.group.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

public class DeleteGroupTests extends TestBase {

        @Test
        public void deleteGroup () {
            app.getNavigationHelper().goToGroupPage();
            int before = app.getGroupHelper().getGroupCount();
            if (!app.getGroupHelper().haveAnyGroup()) {
                app.getGroupHelper().createGroup(new GroupData("Test2", "Test2", "Test2"));
            }
            app.getGroupHelper().selectGroup();
            app.getGroupHelper().deleteGroups();
            app.getGroupHelper().returnToGroupPage();
            int after = app.getGroupHelper().getGroupCount();
            Assert.assertEquals(after, before-1 );
        }

}

