package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().goToHomepage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Katya", "Sadeeva", null, null, null, null, "Test1"),true );
        }
        app.getNavigationHelper().goToHomepage();
        List before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().submitContactDeletion();
        app.getContactHelper().closeDialogWindow();
        app.getNavigationHelper().goToHomepage();
        List after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() - 1);

    }
}
