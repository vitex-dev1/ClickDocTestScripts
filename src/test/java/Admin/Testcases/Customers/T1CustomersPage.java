package Admin.Testcases.Customers;

import Admin.Pages.Customers;
import Common.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T1CustomersPage extends BaseTest {
    Customers Customers;

    @Test(priority = 1)
    public void login() {
        driver.get("http://dev3.vitex.asia:8009/admin/login");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("clickdoc.dev@gmail.com");
        driver.findElement(By.id("password")).sendKeys("nnN3ZYjw");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Test(priority = 2)
    public void accessCustomersPage() {
        Customers = new Customers(driver);
        Customers.clickCustomerMenu();
        Customers.verifyAtCustomersPage();
    }

    @Test(priority = 3)
    public void accessAddNewCustomerPage() {
        Customers.clickAddNewCustomerButton();
        Customers.verifyAtAddNewCustomerPage();
    }

    //Show/Hide Columns. For now write for ID column only
    @Test(priority = 4)

    public void clickToShowHideIDColumns() {
        Customers.clickCustomerMenu();
        Customers.clickColvisDropdown();

        // Check if the element is 'active' or not in COLVIS DROPDOWN
        boolean isActive = driver.findElements(By.xpath("//li[(@data-cv-idx='0') and contains(@class, 'active')]")).size() > 0;
        // Check if the element is 'active' or not in GRID VIEW after clicking in colvis dropdown

        if (isActive) {
            Customers.clickToShowHideColumns(By.xpath("//li[@data-cv-idx='0']"));
            Customers.verifyColumnInvisibility(By.xpath("//li[@data-cv-idx='0']"));
        } else {
            Customers.clickToShowHideColumns(By.xpath("//li[@data-cv-idx='0']"));
            Customers.verifyColumnVisibility(By.xpath("//li[@data-cv-idx='0']"));
        }
    }

    //Restore colvis
    @Test(priority = 5)
    public void restoreColvis(){

    }
}