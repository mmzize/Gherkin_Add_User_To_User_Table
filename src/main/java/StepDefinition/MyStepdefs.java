package StepDefinition;

import Helpers.Read_Data;
import Setup.Setup_Class;
import Test_Functionality.Add_New_User_To_User_Table;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class MyStepdefs {
    private WebDriver driver = Setup_Class.startBrowserOfChoice("http://www.way2automation.com/angularjs-protractor/webtables/","chrome");


    private static String dir = System.getProperty("user.dir");
    private static final String excel = dir + "/src/main/java/Test_Data/TestData.xlsx";
    FileInputStream fis = new FileInputStream(excel);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheetAt(0);
    String first_name = sheet.getRow(1).getCell(0).getStringCellValue();
    String last_name = sheet.getRow(1).getCell(1).getStringCellValue();
    String user_name = sheet.getRow(1).getCell(2).getStringCellValue();
    String pass_word = sheet.getRow(1).getCell(3).getStringCellValue();
    String Role=sheet.getRow(1).getCell(4).getStringCellValue();
    String email = sheet.getRow(1).getCell(5).getStringCellValue();
    String cellphone = sheet.getRow(1).getCell(6).getStringCellValue();

    ////////////JSON DATA///////////////////

    /////////////////////////////////////////

    public MyStepdefs() throws IOException {
    }

    @Given("^Application Launched And User List Table Is Displayed$")
    public void applicationLaunchedAndUserListTableIsDisplayed() {
        Add_New_User_To_User_Table user= PageFactory.initElements(driver,Add_New_User_To_User_Table.class);
        user.Verify_User_List_Table();
    }
    @When("^Adding First User$")
    public void addingFirstUser() {
        Add_New_User_To_User_Table user=PageFactory.initElements(driver,Add_New_User_To_User_Table.class);
        user.Click_Add_New_User_Button();
        user.Add_First_Name(first_name);
        user.Add_Last_Name(last_name);
        user.Add_UserName(user_name);
        user.Add_Password(pass_word);
        user.Add_Customer();
        user.Select_Role(Role);
        user.Add_Email(email);
        user.Add_Mobile_Phone(cellphone);
        user.Click_Button_Save();
    }

    @Then("^User Must Be Displayed On The Table$")
    public void userMustBeDisplayedOnTheTable() throws InterruptedException {
        Add_New_User_To_User_Table user=PageFactory.initElements(driver,Add_New_User_To_User_Table.class);
        user.Verify_Added_User(first_name,last_name);
        driver.quit();
    }
    @Given("^Application Already Launched$")
    public void applicationAlreadyLaunched() {
        Add_New_User_To_User_Table user= PageFactory.initElements(driver,Add_New_User_To_User_Table.class);
        user.Verify_User_List_Table();
    }
    @When("^Adding Second User$")
    public void addingSecondUser() throws IOException, ParseException {
        Add_New_User_To_User_Table user=PageFactory.initElements(driver,Add_New_User_To_User_Table.class);
        Read_Data jsonData=new Read_Data();

        user.Click_Add_New_User_Button();
        user.Add_First_Name(jsonData.get_Firstname());
        user.Add_Last_Name(jsonData.get_Lastname());
        user.Add_UserName(jsonData.get_Username());
        user.Add_Password(jsonData.get_Password());
        user.Add_Customer();
        user.Select_Role(jsonData.get_Role());
        user.Add_Email(jsonData.get_Email());
        user.Add_Mobile_Phone(jsonData.get_Cellphone());
        user.Click_Button_Save();
    }

    @Then("^Second User Must Be Displayed On The Table$")
    public void secondUserMustBeDisplayedOnTheTable() throws InterruptedException, IOException, ParseException {
        Add_New_User_To_User_Table user=PageFactory.initElements(driver,Add_New_User_To_User_Table.class);
        Read_Data jsonData=new Read_Data();
        user.Verify_Added_User(jsonData.get_Firstname(),jsonData.get_Lastname());
        driver.quit();
    }
}
