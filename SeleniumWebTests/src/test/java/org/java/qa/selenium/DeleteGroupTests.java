package org.java.qa.selenium;

import org.testng.annotations.*;

public class DeleteGroupTests extends TestBase {

        @Test
        public void deleteGroup () {
            goToGroupPage();
            selectGroup();
            deleteGroups();
            returnToGroupPage();
        }

}

