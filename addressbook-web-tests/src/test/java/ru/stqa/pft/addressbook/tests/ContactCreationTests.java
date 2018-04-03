package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void creationOfContactTests() {

        app.getNavigationHelper().goToHomepage();
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().createContact(new ContactData("Katya", "Sadeeva", null, null, null, null, "Test1"), true);
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before + 1);
    }


}
