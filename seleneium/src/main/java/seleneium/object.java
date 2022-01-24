package seleneium;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


@Test
public class object {
	public void Amazon() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fl%2F26425875031%2F%3Fpf_rd_r%3DRMEH9KYP1KE3BQ20W8M1%26pf_rd_p%3Db2ea99b8-d88a-4373-be5d-77170512e9ff%26pd_rd_r%3Db97b9ec8-d730-4e9e-833b-aa2738f663f9%26pd_rd_w%3DFOz6s%26pd_rd_wg%3D85ODM%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("ap_email")).sendKeys("keerthu.s1602@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("Kirick");
		driver.findElement(By.id("signInSubmit")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("soft toys");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).submit();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a")).click();
		Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
	
        driver.findElement(By.id("add-to-cart-button")).click();
	}

}
