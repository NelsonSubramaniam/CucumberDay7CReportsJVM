package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

//	public static WebDriver browserLaunch(String browserName) {
//		
//		if (browserName.equalsIgnoreCase("chrome")) {
//			
//			//WebDriverManager.chromedriver().version("97").setup();
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			
//		}
//		
//		else if (browserName.equalsIgnoreCase("firefox")) {
//			
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			
//		}	
//		
//		else if (browserName.equalsIgnoreCase("edge")) {
//			
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			
//		}	
//		
//		else {
//			
//			System.err.println("Invalid Browser Name");
//			
//		}
//		
//		return driver;
//		
//	}
	
	public static WebDriver browserLaunch(String browserName) {
		
		switch (browserName) {
		
		case "Chrome" :
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "chrome" :
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "Firefox" :
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "firefox" :
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "Edge" :
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "edge" :
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		
		default :
			
			System.err.println("Invalid Browser Name");
			
		}
			
		return driver;
		
	}
	
	public static void urlLaunch(String url) {
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public static void  implicitWait(long sec) {
		
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		
	}
	
	public static void quit() {
		
		driver.quit();
		
	}
	
	public static String getCurrentUrl() {
		
		return driver.getCurrentUrl();
		
	}
	
	public static String getTitle() {
		
		return driver.getTitle();
		
	}
	
	public static WebElement findElement(String locator, String locValue) {
		
		WebElement e = null;
		
		if (locator.equals("id"))
			e = driver.findElement(By.id(locValue));  
			
		else if (locator.equals("name")) 
			e = driver.findElement(By.name(locValue));
		
		else if (locator.equals("xpath"))
			e = driver.findElement(By.xpath(locValue));
		
		else if (locator.equals("tagname"))
			e = driver.findElement(By.tagName(locValue));
		
		else if (locator.equals("className"))
			e = driver.findElement(By.className(locValue));
		
		else if (locator.equals("linkText"))
			e = driver.findElement(By.linkText(locValue));
		
		else if (locator.equals("partialLinkText"))
			e = driver.findElement(By.partialLinkText(locValue));
		
		else if (locator.equals("cssSelector"))
			e = driver.findElement(By.cssSelector(locValue));
		
		return e;
		
	}
	
	public static List<WebElement> findElements(String locator, String locValue) {
		
		List<WebElement> e = null;
		
		if (locator.equals("id"))
			e = driver.findElements(By.id(locValue));  
			
		else if (locator.equals("name")) 
			e = driver.findElements(By.name(locValue));
		
		else if (locator.equals("xpath"))
			e = driver.findElements(By.xpath(locValue));
		
		else if (locator.equals("tagname"))
			e = driver.findElements(By.tagName(locValue));
		
		else if (locator.equals("className"))
			e = driver.findElements(By.className(locValue));
		
		else if (locator.equals("linkText"))
			e = driver.findElements(By.linkText(locValue));
		
		else if (locator.equals("partialLinkText"))
			e = driver.findElements(By.partialLinkText(locValue));
		
		else if (locator.equals("cssSelector"))
			e = driver.findElements(By.cssSelector(locValue));
		
		return e;
		
	}
	
	public static String getAttribute( WebElement e ) {
		
		return e.getAttribute("value");
		
	}
	
	public static String getText(WebElement e) {
		
		System.out.println(e.getText());
		return e.getText();
		
	}
	
	public static void sendKeys(WebElement e, String value ) {
		
		e.sendKeys(value);
		
	}
	
	public static void sendKeys(WebElement e, String value, boolean check ) {
		
		if(check)
			e.sendKeys(value);
		else
			e.sendKeys(value, Keys.ENTER);
		
	}
	
	public static void btnClick(WebElement e) {
		
		e.click();
		
	}
	
	public static void optBtnSelect(WebElement e) {
		
		e.click();
		
	}
	
	public static void checkBoxSelect(WebElement e) {
		
		e.click();
		
	}
	
	public static void moveToElement(WebElement target) {
		
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();
		
	}
	
	public static void dragAndDrop(WebElement source, WebElement target) {
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
		
	}
	
	public static void selectByIndex(WebElement e, int index) {
		
		Select s = new Select(e);
		s.selectByIndex(index);
		
	}
	
	public static void selectByValue(WebElement e, String value) {
		
		Select s = new Select(e);
		s.selectByValue(value);
		
	}
	
	public static void selectByVisibleText(WebElement e, String text) {
		
		Select s = new Select(e);
		s.selectByVisibleText(text);
		
	}
	
	public static void takeScreenshot(String imageName) throws IOException {
		
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Screenshots\\" + imageName + ".png");
		FileUtils.copyFile(src, des);
		
	}
	
	public static void jsSendKeys(WebElement e, String input) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '" + input + "')", e);
		
	}
	
	public static void jsScrollDown(WebElement e) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
		
	}
	
	public static void jsScrollUp(WebElement e) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
		
	}
	
	public static void getParticularWindow(int windowNo) {
		
		Set<String> getAllWindow = driver.getWindowHandles();
		List<String> getWindow = new ArrayList<String>();
		getWindow.addAll(getAllWindow);
		driver.switchTo().window(getWindow.get(windowNo));
		
	}
	
	public static String getExcelData(String fileName, String sheetName, int rowNo, int cellNo) throws IOException {
		
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\" + fileName + ".xlsx");

		FileInputStream st = new FileInputStream(loc);

		Workbook w = new XSSFWorkbook(st);

		Sheet sheet = w.getSheet(sheetName);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);
		
		int type = cell.getCellType();
		
		String value = null;
		
		if (type == 1)
			value = cell.getStringCellValue();
		else
			if(DateUtil.isCellDateFormatted(cell))
				value = new SimpleDateFormat("dd/MM/yyyy").format(cell.getDateCellValue());
			else
				value = String.valueOf((long) cell.getNumericCellValue());
		
		return value;
		
	}
	
	public static void updateExcelData(String fileName, String sheetName, int rowNo, int cellNo, String cellContent) throws IOException {
		
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\" + fileName + ".xlsx");

		FileInputStream st = new FileInputStream(loc);

		Workbook w = new XSSFWorkbook(st);

		Sheet sheet = w.getSheet(sheetName);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.createCell(cellNo);
		
		cell.setCellValue(cellContent);
		
		FileOutputStream ot = new FileOutputStream(loc);
		w.write(ot);

	}
	
	public static void simpleAlertForAccept() {
		
		Alert sa = driver.switchTo().alert();
		sa.accept();
		
	}
	
	public static void confirmAlertForAccept() {
		
		Alert ca = driver.switchTo().alert();
		ca.accept();
		
	}
	
	public static void confirmAlertForDismiss() {
		
		Alert ca = driver.switchTo().alert();
		ca.dismiss();
		
	}
	
	public static String promptAlertForAccept(String message) {
		
		Alert pa = driver.switchTo().alert();
		pa.sendKeys(message);
		pa.accept();
		
		return message;
		
	}
	
	public static String promptAlertForDismiss(String message) {
		
		Alert pa = driver.switchTo().alert();
		pa.sendKeys(message);
		pa.dismiss();
		
		return message;
		
	}
	
	public static boolean waitForURL(String partialValueOfURL) {
	
		WebDriverWait w = new WebDriverWait(driver, 20);
	    
	    return w.until(ExpectedConditions.urlContains(partialValueOfURL));
		
	}
	
}
