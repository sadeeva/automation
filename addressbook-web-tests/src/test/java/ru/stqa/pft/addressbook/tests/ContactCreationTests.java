package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void creationOfContactTests() {

        app.gotoAddNewPage();
        app.initContactCreation();
        app.fillContactInfo(new ContactData("Katya", "Sadeeva", "Addressbook", "Boston", "5555555555", "sadeeva@gmail.com"));
        app.submitContactCreation();
        app.returnToHomePage();
    }


}
