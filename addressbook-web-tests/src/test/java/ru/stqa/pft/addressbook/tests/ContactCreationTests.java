package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void creationOfContactTests() {

        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactInfo(new ContactData("Katya", "Sadeeva", null, null, null, null, "Test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
    }


}
