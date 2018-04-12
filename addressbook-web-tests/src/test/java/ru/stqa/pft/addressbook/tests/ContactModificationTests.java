package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


public class ContactModificationTests extends TestBase {

    @Test

    public void testContactModification() {

        app.getNavigationHelper().goToHomepage();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Katya", "Sadeeva", null, null, null, null, "Test1"),true );
        }
        app.getNavigationHelper().goToHomepage();
        List<ContactData> before = app.getContactHelper().getContactList();
        app.getContactHelper().selectContact(before.size() - 1);
        app.getContactHelper().editContactPencil();
        ContactData contact = new ContactData(before.get(before.size() - 1).getId(),"Katya", "Sadeeva", null, null, null, null, null);
        app.getContactHelper().fillContactInfo(contact,false);
        app.getContactHelper().submitUpdate();
        app.getNavigationHelper().goToHomepage();
        List after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() - 1);
        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(),c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before,after);

    }
}
