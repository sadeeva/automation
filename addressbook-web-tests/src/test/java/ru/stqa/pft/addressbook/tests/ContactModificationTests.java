package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;


public class ContactModificationTests extends TestBase {

    @Test

    public void testContactModification() {

        app.getNavigationHelper().goToHomepage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Katya", "Sadeeva", null, null, null, null, "Test1"),true );
        }
        app.getNavigationHelper().goToHomepage();
        List before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().editContactPencil();
        app.getContactHelper().fillContactInfo(new ContactData("Katya", "Sadeeva", "Addressbook", "Boston", "5555555555", "sadeeva@gmail.com", "null"), false);
        app.getContactHelper().submitUpdate();
        app.getNavigationHelper().goToHomepage();
        List after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

    }
}
