package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactModificationTests extends TestBase {

    @Test

    public void testContactModification() {
        app.getContactHelper().selectContact();
        app.getContactHelper().editContactPencil();
        app.getContactHelper().fillContactInfo(new ContactData("Katya", "Sadeeva", "Addressbook", "Boston", "5555555555", "sadeeva@gmail.com"));
        app.getContactHelper().submitUpdate();
        app.getNavigationHelper().goToHomepage();

    }
}
