package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class PIMPage {
    WebDriver driver = Browser.driver;

    @FindBy(linkText = "Recruitment") private WebElement recruitmentLink;
    // @FindAll(css = ".oxd-input.oxd-input--active") private List<WebElement> inputs; //not working
    @FindBy(css = "button[type='submit']") private WebElement searchButton;
    @FindBy(xpath = "//div[@class = 'oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/div[3]/div")
    private WebElement firstNameElement;
    @FindBy(xpath = "//div[@class = 'oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']/div[4]/div")
    private WebElement lastNameElement;
    @FindBy(linkText = "Admin") private WebElement adminLink;



    public RecruitmentPage navigateToRecruitmentPage() {
        recruitmentLink.click();
        return PageFactory.initElements(Browser.driver, RecruitmentPage.class);
    }
    public PIMPage searchEmployeeId(String id) {
        List<WebElement> elements = driver.findElements(By.cssSelector(".oxd-input.oxd-input--active"));
        elements.get(1).sendKeys(id);
        searchButton.click();
        return this; //this we did not move from this page
        //return PageFactory.initElements(Browser.driver, PIMPage.class); //same as prev line

    }
    public PIMPage validateFirstAndLastName (String firstName, String lastName) {
        Assert.assertEquals(firstNameElement.getText(), firstName);
        Assert.assertEquals(lastNameElement.getText(), lastName);
        return this;
    }

    public AdminPage navigateToAdminPage() {
        adminLink.click();
        return PageFactory.initElements(Browser.driver, AdminPage.class);
    }
}
