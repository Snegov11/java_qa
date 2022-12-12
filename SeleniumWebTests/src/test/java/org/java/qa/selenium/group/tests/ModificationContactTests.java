package org.java.qa.selenium.group.tests;

import org.java.qa.selenium.group.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModificationContactTests extends  TestBase{

    @Test
    public void testContactModification() {
        app.getNavigationHelper().returnToContactPage();
        int before = app.getContactsHelper().getContactsCount();
        app.getContactsHelper().initContactModification();
        app.getContactsHelper().fillContact(new ContactData(
                "Modif middle name",
                "Modif last name",
                "modifemail@modifemai.com",
                "Modif address",
                "111 111 11 11",
                null), false);
        app.getContactsHelper().updateContact();
        app.getNavigationHelper().returnToContactPage();
        int after = app.getContactsHelper().getContactsCount();
        Assert.assertEquals(after, before);
    }

}
