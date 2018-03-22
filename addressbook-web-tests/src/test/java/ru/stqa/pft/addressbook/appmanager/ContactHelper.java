package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToHomePage() {
       click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactInfo(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("company"),contactData.getCompany());
        type(By.name("address"),contactData.getAddress());
        type(By.name("mobile"),contactData.getMobile());
        type(By.name("email"),contactData.getEmail());

    }

    public void initContactCreation() {
       click(By.name("firstname"));
    }

    public void selectContact() {
        click(By.name("selected[]"));

    }

    public void submitContactDeletion() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    }

    public void closeDialogWindow() {
        wd.switchTo().alert().accept();
    }

    public void editContactPencil() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));

    }

    public void submitUpdate() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));

    }
}
