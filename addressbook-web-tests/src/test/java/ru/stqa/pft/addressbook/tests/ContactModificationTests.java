package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Comparator;
import java.util.List;


public class ContactModificationTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.goTo().homePage();
        if (app.contact().list().size() == 0) {
            app.contact().create(new ContactData("Katya", "Sadeeva", null, null, null, null, "Test1"),true );
        }
    }

    @Test

    public void testContactModification() {


        app.goTo().homePage();
        List<ContactData> before = app.contact().list();
        int index = before.size() - 1;
        ContactData contact = new ContactData(before.get(index).getId(),"Katya", "Sadeeva", null, null, null, null, null);
        app.contact().modify(index, contact);
        app.goTo().homePage();
        List after = app.contact().list();
        Assert.assertEquals(after.size(), before.size());

        before.remove(index);
        before.add(contact);
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(),c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before,after);

    }


}
