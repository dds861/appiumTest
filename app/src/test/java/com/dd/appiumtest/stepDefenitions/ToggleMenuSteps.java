package com.dd.appiumtest.stepDefenitions;

import java.net.MalformedURLException;

import com.dd.appiumtest.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.dd.appiumtest.pages.ToggleMenuPage;

public class ToggleMenuSteps extends BaseTest {
    private ToggleMenuPage toggleMenuPage = new ToggleMenuPage(driver, wait);

    public ToggleMenuSteps() throws MalformedURLException, InterruptedException {
        super();
    }

    @Given("The main page")
    public void the_main_page() {
    }

    @When("I am on main page")
    public void i_am_on_x_page() {

    }

    @And("I open toggle menu")
    public void i_open_toggle_menu() {
        toggleMenuPage.open();
        toggleMenuPage.checkIfStartTextExist();
    }

    @And("I select Sectors item")
    public void i_select_sectors_item() {
        toggleMenuPage.selectSectors();
    }

    @And("I select Services item")
    public void i_select_services_item() {
        toggleMenuPage.selectServices();
    }

    @And("I select Persons item")
    public void i_select_persons_item() {
        toggleMenuPage.selectPersons();
    }

    @And("I select Media item")
    public void i_select_media_item() {
        toggleMenuPage.selectMedia();
    }

    @And("I select Contacts item")
    public void i_select_contacts_item() {
        toggleMenuPage.selectContacts();
    }

    @Then("I close toggle menu")
    public void i_close_toggle_menu() {
        toggleMenuPage.close();
    }
}
