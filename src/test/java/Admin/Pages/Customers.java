package Admin.Pages;

import asia.dev3.vitex.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Customers {
    //Khai báo driver cục bộ trong chính class này
    private WebDriver driver;

    //Khai báo hàm xây dựng, để truyền driver từ bên ngoài (Ham chung) vào chính class này sử dụng
    public Customers(WebDriver driver) {
        this.driver = driver;
        new Actions(driver); //Khởi tạo giá trị driver cho class Actions
    }

    //Khai báo các element dạng đối tượng By (phương thức tìm kiếm)
    private By customersMenu = By.xpath("//a[@href='http://dev3.vitex.asia:8009/en/admin/clients' and .//i[@class='fa fa-building-o']]");
    private By pageTitle = By.xpath("//li[normalize-space()='1 '?/.']");
    private By newCustomer = By.xpath("//a[contains(@class, 'datatable-redirect') and contains(@class, 'btn-secondary')]");
    private By copyTableButton = By.xpath("//i[@title='Copy']");
    private By exportDropdown = By.xpath("//button[(normalize-space(@class)='btn btn-default buttons-collection btn-secondary')]");
    private By printButton = By.xpath("//button[(normalize-space(@class)='btn btn-default buttons-print btn-secondary')]");
    private By colvisDropdown = By.xpath("//button[contains(@class, 'buttons-collection buttons-colvis')]");
    private By colvisID = By.xpath("//li[@data-cv-idx='0']");
    private By colvisIDVisibility = By.xpath("//li[(@data-cv-idx='0') and contains(@class, 'active')]");
    private By colvisClientName = By.xpath("//li[@data-cv-idx='1']");
    private By colvisClientNameVisibility = By.xpath("//li[(@data-cv-idx='1') and contains(@class, 'active')]");
    private By colvisAddress = By.xpath("//li[@data-cv-idx='2']");
    private By colvisAddressVisibility = By.xpath("//li[(@data-cv-idx='2') and contains(@class, 'active')]");
    private By colvisCountry = By.xpath("//li[@data-cv-idx='3']");
    private By colvisCountryVisibility = By.xpath("//li[(@data-cv-idx='3') and contains(@class, 'active')]");
    private By colvisPMS = By.xpath("//li[@data-cv-idx='4']");
    private By colvisPMSVisibility = By.xpath("//li[(@data-cv-idx='4') and contains(@class, 'active')]");
    private By colvisCategory = By.xpath("//li[@data-cv-idx='5']");
    private By colvisCategoryVisibility = By.xpath("//li[(@data-cv-idx='5') and contains(@class, 'active')]");
    private By colvisDemo = By.xpath("//li[@data-cv-idx='6']");
    private By colvisDemoVisibility = By.xpath("//li[(@data-cv-idx='6') and contains(@class, 'active')]");
    private By colvisREF = By.xpath("//li[@data-cv-idx='7']");
    private By colvisREFVisibility = By.xpath("//li[(@data-cv-idx='7') and contains(@class, 'active')]");
    private By colvisInstallationID = By.xpath("//li[@data-cv-idx='8']");
    private By colvisInstallationIDVisibility = By.xpath("//li[(@data-cv-idx='8') and contains(@class, 'active')]");
    private By colvisPhone = By.xpath("//li[@data-cv-idx='9']");
    private By colvisPhoneVisibility = By.xpath("//li[(@data-cv-idx='9') and contains(@class, 'active')]");
    private By colvisBillingCustomerNr = By.xpath("//li[@data-cv-idx='10']");
    private By colvisBillingCustomerNrVisibility = By.xpath("//li[(@data-cv-idx='10') and contains(@class, 'active')]");
    private By colvisBillingCompanyName = By.xpath("//li[@data-cv-idx='11']");
    private By colvisBillingCompanyNameVisibility = By.xpath("//li[(@data-cv-idx='11') and contains(@class, 'active')]");
    private By colvisBillingAddress = By.xpath("//li[@data-cv-idx='12']");
    private By colvisBillingAddressVisibility = By.xpath("//li[(@data-cv-idx='12') and contains(@class, 'active')]");
    private By colvisDueDate = By.xpath("//li[@data-cv-idx='13']");
    private By colvisDueDateVisibility = By.xpath("//li[(@data-cv-idx='13') and contains(@class, 'active')]");
    private By colvisBillingVATNr = By.xpath("//li[@data-cv-idx='14']");
    private By colvisBillingVATNrVisibility = By.xpath("//li[(@data-cv-idx='14') and contains(@class, 'active')]");
    private By colvisActions = By.xpath("//li[@data-cv-idx='15']");
    private By colvisActionsVisibility = By.xpath("//li[(@data-cv-idx='15') and contains(@class, 'active')]");
    private By colvisRestore = By.xpath("//li[@data-cv-idx='16']");
    private By onlyDemo = By.xpath("//label[@for='only_demo_customers']");
    private By showBilling = By.xpath("//label[@for='show_billing_info']");
    private By searchInput = By.xpath("//input[@id='dt-search-0']");
    private By clientNameColumnTitle = By.xpath("//th[@data-field='name']");
    private By addressColumnTitle = By.xpath("//th[@data-field='client_address']");
    private By pmsColumnTitle = By.xpath("//th[@data-field='pms']");
    private By categoryColumnTitle = By.xpath("//th[@data-field='category_name']");
    private By demoColumnTitle = By.xpath("//th[@data-field='is_demo']");
    private By refColumnTitle = By.xpath("//th[@data-field='ref']");
    private By actionsColumnTitle = By.xpath("//th[@data-field='action']");
    private By idColumnTitle = By.xpath("//th[@data-field='id']");
    private By countryColumnTitle = By.xpath("//th[@data-field='country_name']");
    private By installationIDColumnTitle = By.xpath("//th[@data-field='installation_id']");
    private By phoneColumnTitle = By.xpath("//th[@data-field='phone']");
    private By billingCustomerNrColumnTitle = By.xpath("//th[@data-field='billing_customer_number']");
    private By billingCompanyNameColumnTitle = By.xpath("//th[@data-field='billing_company_name']");
    private By billingAddressColumnTitle = By.xpath("//th[@data-field='billing_address']");
    private By dueDateColumnTitle = By.xpath("//th[@data-field='due_date']");
    private By billingVATNrColumnTitle = By.xpath("//th[@data-field='billing_vat_number']");
    private By editButton = By.xpath("(//i[@class='fa fa-pencil'])[1]");
    private By copyDemoClientButton = By.xpath("(//i[@class='fa fa-copy'])[1]");
    private By deleteButton = By.xpath("(//i[@class='fa fa-trash'])[1]");
    private By entriesPerPagedropdown = By.xpath("//select[@id='dt-length-0']");
    private By firstPageButton = By.xpath("//button[@data-dt-idx='first']");
    private By previousPageButton = By.xpath("//button[@data-dt-idx='previous']");
    private By nextPageButton = By.xpath("//button[@data-dt-idx='next']");
    private By lastPageButton = By.xpath("//button[@data-dt-idx='last']");
    private By page1Button = By.xpath("//button[@data-dt-idx='0']");
    private By page2Button = By.xpath("//button[@data-dt-idx='1']");

    //Actions
    public void clickCustomerMenu() {
        Actions.clickElement(customersMenu);
    }

    public void clickAddNewCustomerButton() {
        Actions.waitForOverlaysToDisappear(By.xpath("//div[@class='spinner']"));
        Actions.clickElement(newCustomer);
    }

    public void clickColvisDropdown() {
        Actions.clickElement(colvisDropdown);
    }

    public void clickToShowHideColumns(By xpath) {
        Actions.clickElement(xpath);
    }
//public void setEmail(String email) {
//        //driver.findElement(inputEmail).sendKeys(email);
//        WebUI.setText(inputEmail, email);
//    }
//
//    public void setPassword(String password) {
//        //driver.findElement(inputPassword).sendKeys(password);
//        WebUI.setText(inputPassword, password);
//    }


    //Assertions
    public void verifyAtCustomersPage() {
        Assert.assertTrue(driver.getCurrentUrl().equals("http://dev3.vitex.asia:8009/en/admin/clients"), "FAIL. Not at Customers Page");
    }
    public void verifyAtAddNewCustomerPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("clients/create"), "FAIL. Not at Add New Customer Page");
    }

    //try catch No such Element
    private boolean checkElementExist(By xpath){
        try {
            driver.findElement(xpath);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void verifyColumnVisibility(By xpath) {
        //Assert.assertTrue(driver.findElement(xpath).isDisplayed(), "Column not displayed");
        Assert.assertTrue(checkElementExist(xpath), "Column not displayed");
    }

    public void verifyColumnInvisibility(By xpath) {
        //Assert.assertFalse(driver.findElement(xpath).isDisplayed(), "Column still displayed");
        Assert.assertFalse(checkElementExist(xpath), "Column not displayed");
    }
}
//    public void verifyLoginFail() {
//        Assert.assertTrue(driver.getCurrentUrl().contains("authentication"), "FAIL. Không còn ở trang Login");
//        Assert.assertTrue(driver.findElement(errorMessage).isDisplayed(), "Error message NOT displays");
//        Assert.assertEquals(driver.findElement(errorMessage).getText(), "Invalid email or password", "Content of error massage NOT match.");


