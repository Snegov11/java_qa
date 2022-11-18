package org.java.qa.selenium.group.tests;

import org.testng.annotations.Test;

public class ModificationGroupTests extends  TestBase{

    @Test
    public void testGoupModification() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getNavigationHelper().goToGroupPage();
    }

}
