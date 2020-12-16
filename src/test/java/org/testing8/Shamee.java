package org.testing8;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Shamee {
static WebElement element;
static Select sel;
public static void main(String[] args) throws IOException, InterruptedException {
File f=new File("C:\\Users\\User\\Documents\\New folder\\Shameema8\\TestData\\AdactinExcel.xlsx");
Workbook w=new XSSFWorkbook();
Sheet s=w.createSheet("Sheets4");
s.createRow(1).createCell(0).setCellValue("ShameemaHashim");
s.createRow(0).createCell(1).setCellValue("shamee");
FileOutputStream fout=new FileOutputStream(f);
w.write(fout);
System.out.println("done successfully");
FileInputStream fin=new FileInputStream(f);
Workbook w1=new XSSFWorkbook(fin);
Sheet s1=w1.getSheet("Sheets4");
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\New folder\\Shameema8\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(" http://www.adactin.com/HotelApp/");

WebElement usernm=driver.findElement(By.id("username"));
Cell print=s1.getRow(1).getCell(0);
System.out.println(print);
String output=print.getStringCellValue();
usernm.sendKeys(output);
Thread.sleep(3000);

WebElement password=driver.findElement(By.id("password"));
Cell printpass=s1.getRow(0).getCell(1);
System.out.println(printpass);
String outputpass=printpass.getStringCellValue();
password.sendKeys(outputpass);

WebElement btnclick=driver.findElement(By.id("login"));
btnclick.click();
WebElement location=driver.findElement(By.id("location"));
sel=new Select(location);
sel.selectByIndex(3);
WebElement hotels=driver.findElement(By.id("hotels"));
sel=new Select(hotels);
sel.selectByIndex(2);
WebElement roomtyp=driver.findElement(By.id("room_type"));
sel=new Select(roomtyp);
sel.selectByIndex(2);
WebElement noofrooms=driver.findElement(By.id("room_nos"));
sel=new Select(noofrooms);
sel.selectByIndex(5);
WebElement checkindate=driver.findElement(By.id("datepick_in"));
checkindate.sendKeys("07//01//2021");
WebElement checkoutdate=driver.findElement(By.id("datepick_out"));
checkoutdate.sendKeys("10//01//2021");
WebElement Adults=driver.findElement(By.id("adult_room"));
sel=new Select(Adults);
sel.selectByIndex(3);
WebElement Children=driver.findElement(By.id("child_room"));
sel=new Select(Children);
sel.selectByIndex(3);
WebElement search=driver.findElement(By.id("Submit"));
search.click();
Thread.sleep(2000);
WebElement radiobtn=driver.findElement(By.id("radiobutton_0"));
radiobtn.click();
WebElement btncontinue=driver.findElement(By.id("continue"));
btncontinue.click();
WebElement Firstname=driver.findElement(By.id("first_name"));
Firstname.sendKeys("Shameema");
WebElement Lastname=driver.findElement(By.id("last_name"));
Lastname.sendKeys("Banu");
WebElement Address=driver.findElement(By.id("address"));
Address.sendKeys("No.9,RAinbow street");
WebElement credit=driver.findElement(By.id("cc_num"));
credit.sendKeys("1234567890123456");
WebElement cardtyp=driver.findElement(By.id("cc_type"));
sel=new Select(cardtyp);
sel.selectByIndex(1);
WebElement cvv=driver.findElement(By.id("cc_cvv"));
cvv.sendKeys("230");
WebElement selectmonth=driver.findElement(By.id("cc_exp_month"));
sel=new Select(selectmonth);
sel.selectByIndex(5);
WebElement selectyear=driver.findElement(By.id("cc_exp_year"));
sel=new Select(selectyear);
sel.selectByIndex(8);
WebElement book=driver.findElement(By.id("book_now"));
book.click();
Thread.sleep(5000);
WebElement orderno=driver.findElement(By.id("order_no"));

String output1=orderno.getText();
System.out.println(output1);
return;
}
	}


	
