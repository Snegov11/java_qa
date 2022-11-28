package org.java.qa.selenium.group.tests;

import org.java.qa.selenium.group.model.ContactData;
import org.testng.annotations.Test;

public class ModificationContactTests extends  TestBase{

    @Test
    public void testContactModification() {
        app.getContactsHelper().returnToContactPage();
        app.getContactsHelper().initContactModification();
        app.getContactsHelper().fillContact(new ContactData(
                "Modif middle name",
                "Modif last name",
                "modifemail@modifemai.com",
                "Modif address",
                "111 111 11 11",
                null), false);
        app.getContactsHelper().updateContact();
    }

}
