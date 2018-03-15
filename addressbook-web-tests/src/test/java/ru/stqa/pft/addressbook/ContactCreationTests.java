package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void creationOfContactTests() {

        gotoAddNewPage();
        initContactCreation();
        fillContactInfo(new ContactData("Katya", "Sadeeva", "Addressbook", "Boston", "5555555555", "sadeeva@gmail.com"));
        submitContactCreation();
        returnToHomePage();
    }


}
