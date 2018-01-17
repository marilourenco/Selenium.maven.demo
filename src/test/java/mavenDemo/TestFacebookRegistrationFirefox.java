package mavenDemo;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistrationFirefox {

	@Test
	public void TestFireFox() {
		System.setProperty("webdriver.gecko.driver", "D:/eclipse/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("firstname")).sendKeys("Automação");
		driver.findElement(By.name("lastname")).sendKeys("De Software");
		driver.findElement(By.name("reg_email__")).sendKeys("automationemailtest18@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("automationemailtest18@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("ma12345678");
		WebElement day_dropdown = driver.findElement(By.name("birthday_day"));
		Select birthday_day = new Select(day_dropdown);
		birthday_day.selectByValue("2");
		WebElement month_dropdown = driver.findElement(By.name("birthday_month"));
		Select birthday_month = new Select(month_dropdown);
		birthday_month.selectByValue("12");
		WebElement year_dropdown = driver.findElement(By.name("birthday_year"));
		Select birthday_year = new Select(year_dropdown);
		birthday_year.selectByValue("1987");
		WebElement radiobutton = driver.findElement(By.id("u_0_b"));
		radiobutton.click();
		

	}

}
