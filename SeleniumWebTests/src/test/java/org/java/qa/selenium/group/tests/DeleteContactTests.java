package org.java.qa.selenium.group.tests;

import org.java.qa.selenium.group.model.ContactData;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase {

    @Test
    public void deleteContact() {
        app.getNavigationHelper().goToAddContactsPage();
        app.getContactsHelper().startCreationContact();
        app.getContactsHelper().fillContact(new ContactData(
                "test",
                "test",
                "test@test.ru",
                "test 123",
                "000 000 00 00",
                null), false);
        app.getContactsHelper().submitAddContact();
        app.getContactsHelper().returnToContactPage();
        app.getContactsHelper().selectContact();
        app.getContactsHelper().clickDelete();
        app.getContactsHelper().acceptDeleteContact();
    }

}
