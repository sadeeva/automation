package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactModificationTests extends TestBase {

    @Test

    public void testContactModification() {

        app.getNavigationHelper().goToHomepage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Katya", "Sadeeva", null, null, null, null, "Test1"),true );
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().editContactPencil();
        app.getContactHelper().fillContactInfo(new ContactData("Katya", "Sadeeva", "Addressbook", "Boston", "5555555555", "sadeeva@gmail.com", "null"), false);
        app.getContactHelper().submitUpdate();
        app.getNavigationHelper().goToHomepage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);

    }
}
