package org.java.qa.selenium.tests;

import org.testng.annotations.*;

public class DeleteGroupTests extends TestBase {

        @Test
        public void deleteGroup () {
            app.getNavigationHelper().goToGroupPage();
            app.getGroupHelper().selectGroup();
            app.getGroupHelper().deleteGroups();
            app.getGroupHelper().returnToGroupPage();
        }

}

