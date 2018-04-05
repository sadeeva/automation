package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase {

    @Test
    public void creationOfContactTests() {

        app.getNavigationHelper().goToHomepage();
        List before = app.getContactHelper().getContactList();
        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().createContact(new ContactData("Katya", "Sadeeva", null, null, null, null, "Test1"), true);
        List after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }


}
