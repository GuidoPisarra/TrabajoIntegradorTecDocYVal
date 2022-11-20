import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnicenSearch{
	private final WebDriver driver;
	    
	public UnicenSearch() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	public void launchTest() {
		driver.navigate().to("https://www.unicen.edu.ar");
		String titulo = driver.getTitle();	
		System.out.println("Ingresó en la web " + titulo);
		
		// Se espera a que cargue la barra de busqueda
		WebDriverWait wait = new WebDriverWait(driver, 12000);		
		WebElement element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search_block_form")));
		
		//Buscamos alumnos
		element.sendKeys("alumnos");
		
		//Por ultimo hacemos click en la "lupa" para buscar
		element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("op")));
		element.click(); 
	}
		
	public void closeDriver() {
		if(driver!=null) {
			driver.close();
			
			System.out.println("Finalizo correctamente");
		}
	}
}









































