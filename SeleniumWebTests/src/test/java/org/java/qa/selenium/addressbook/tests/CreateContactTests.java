package org.java.qa.selenium.addressbook.tests;

import org.java.qa.selenium.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class CreateContactTests extends TestBase {

    @Test
    public void createContact() {
        app.getNavigationHelper().goToAddContactsPage();
        app.getContactsHelper().startCreationContact();
        app.getContactsHelper().fillContact(new ContactData("test", "test", "test@test.ru", "test 123", "000 000 00 00"));
        app.getContactsHelper().submitAddContact();
        app.getContactsHelper().returnToContactPage();
    }

}
