package jioCenema;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioCenema {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.jiocinema.com/");
	driver.findElement(By.className("leftNavButton")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("rail_jio_voot-common_my-voot_0_editorial_1890249414")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[@class='MuiTypography-root MuiTypography-base mui-style-1cdpve8-base']")).click();
}
}
