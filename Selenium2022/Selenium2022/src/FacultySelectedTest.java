import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.asserts.Assertion;



public class FacultySelectedTest {
	private final WebDriver driver;
	
	    
	public FacultySelectedTest() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette",true );
		this.driver = new ChromeDriver();
		
	}

	public void launchTest() {
		driver.navigate().to("https://www.unicen.edu.ar");
		driver.manage().window().maximize();
		String titulo = driver.getTitle();	
		String textoEsperado = "Facultad de Ciencias Económicas";
		
		System.out.println("Ingresó en la web " + titulo);		
		
		Select selectFaculty = new Select (driver.findElement(By.id("facultades")));
		selectFaculty.selectByVisibleText("Facultad de Ciencias Económicas");
		Assert.assertTrue(selectFaculty.getFirstSelectedOption().getText().toString().equals(textoEsperado),"El texto no se corresponde" );
		
	}
		
	public void closeDriver() {
		if(driver!=null) {
			//driver.close();
			System.out.println("Finalizo correctamente");
		}
	}
}









































