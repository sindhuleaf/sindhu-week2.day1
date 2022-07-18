package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	private static Object Duration;

	public static void main(String[] args) {
		//1. Launch URL "http://leaftaps.com/opentaps/control/login"
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//3. Click on Login Button using Class Locator
				driver.findElement(By.className("decorativeSubmit")).click();
				//4. Click on CRM/SFA Link
				driver.findElement(By.linkText("CRM/SFA")).click();
				//5. Click on Leads Button
				driver.findElement(By.linkText("Leads")).click();
				//6. Click on Create Lead 
				driver.findElement(By.linkText("Create Lead")).click();
				//7. Enter CompanyName Field Using id Locator
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				// 8. Enter FirstName Field Using id Locator
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sindhu");
				 //9. Enter LastName Field Using id Locator
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
				//10. Enter FirstName(Local) Field Using id Locator
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sin");
				//11. Enter Department Field Using any Locator of Your Choice
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("NON-IT");
				//12. Enter Description Field Using any Locator of your choice 
				driver.findElement(By.name("description")).sendKeys("To create new lead");
				// 13. Enter your email in the E-mail address Field using the locator of your choice
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sindhu300691@gmail.com");
				//14. Select State/Province as NewYork Using Visible Text
				WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select drop1 = new Select(state);
				drop1.selectByVisibleText("New York");
				//15. Click on Create Button
				driver.findElement(By.className("smallSubmit")).click();
				//16. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
				String title = driver.getTitle();
				System.out.println(title);
				//17. Click on Duplicate button
				driver.findElement(By.linkText("Duplicate Lead")).click();
				//18. Clear the CompanyName Field using .clear() And Enter new CompanyName
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Grow with Leaf");
				//19.Clear the FirstName Field using .clear() And Enter new FirstName
				driver.findElement(By.id("createLeadForm_firstName")).clear();
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sindhu");
				// 20.Click on Create Lead Button
				driver.findElement(By.className("smallSubmit")).click();
				//21. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
				String title2 = driver.getTitle();
				System.out.println(title2);

			}

	}


