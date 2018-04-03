package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().goToHomepage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Katya", "Sadeeva", null, null, null, null, "Test1"),true );
        }
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().goToHomepage();
        app.getContactHelper().selectContact();
        app.getContactHelper().submitContactDeletion();
        app.getContactHelper().closeDialogWindow();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
        app.getNavigationHelper().goToHomepage();
    }
}
