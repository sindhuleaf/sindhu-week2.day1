package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();// setup path,Import WebDriverManager
		EdgeDriver driver = new EdgeDriver();// launch the browser,Import EdgeDriver
		driver.get("http://leaftaps.com/opentaps/control/login");// load the URL
		driver.manage().window().maximize();// maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// add the wait,Import java time duration
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");// enter username
		driver.findElement(By.id("password")).sendKeys("crmsfa");// enter password
		driver.findElement(By.className("decorativeSubmit")).click();// click login button
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();// click CRM/SFA
		driver.findElement(By.linkText("Leads")).click();// click Lead
		driver.findElement(By.linkText("Create Lead")).click();// click Create Lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");// enter company Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sindhu");// enter First Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");// enter Last Name
		// dropdown
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));// source name can be any name
		Select drop1 = new Select(source);// import select
		drop1.selectByVisibleText("Conference");// dropdown selected as conference by visibletext
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sin");// enter Local Name
		driver.findElement(By.name("departmentName")).sendKeys("NON-IT");// enter Department
		driver.findElement(By.name("description")).sendKeys("Automation Tester");// Enter description
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sindhu300691@gmail.com");// Enter E-mail
																										// id
		WebElement raw = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));// raw name can be any
																								// name
		Select drop2 = new Select(raw);// import select
		drop2.selectByVisibleText("New York");// dropdown selected as NewYork by visibletext
		driver.findElement(By.name("submitButton")).click();// click create Lead
		String title2 = driver.getTitle();
		System.out.println(title2);

	}

	
	
	
	}


