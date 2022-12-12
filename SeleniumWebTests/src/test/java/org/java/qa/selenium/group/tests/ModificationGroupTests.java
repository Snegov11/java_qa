package org.java.qa.selenium.group.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ModificationGroupTests extends  TestBase{

    @Test
    public void testGoupModification() {
        app.getNavigationHelper().goToGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getNavigationHelper().goToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);
    }

}
