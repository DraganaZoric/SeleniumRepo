package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishListPage {
	WebDriver driver;
	WebElement printedDressView;
	WebElement addToWishListButton;
	WebElement addedWishiListCLosePopUp;
	WebElement userInfoHeader;
	WebElement myWishListButton;
	WebElement checkIsDeleteVisible;
	WebElement deleteButton;
	
	
	
	public MyWishListPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getPrintedDressView() {
		String title="Printed Dress";
		return driver.findElement(By.cssSelector("[title^='"+title+"']"));
	}

	public void printedDressViewClick() {
		this.getPrintedDressView().click();
	}

	public WebElement getAddToWishListButton() {
		return driver.findElement(By.id("wishlist_button"));
	}
	
	public void addToWishListButtonClick() {
		this.getAddToWishListButton().click();
	}

	public WebElement getAddedWishiListCLosePopUp() {
		return driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a"));
	}
	public void addedWishListClosePopUpClick() {
		this.getAddedWishiListCLosePopUp().click();
	}
	
	public WebElement getUserInfoHeader() {
		return driver.findElement(By.className("header_user_info"));
	}
	public void userInfoHeaderClick() {
		this.getUserInfoHeader().click();;
	}

	public WebElement getMyWishListButton() {
		return driver.findElement(By.className("icon-heart"));
	}
	public void myWishListButtonClick() {
		this.getMyWishListButton().click();
	}
	
	
	public WebElement getCheckIsDeleteVisible() {
		return driver.findElement(By.className("icon-remove"));
	}
	
	public WebElement getDeleteButton() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_35193\"]/td[6]/a/i"));
	}
	public void checkIsDeleteVisible() {
		this.getMyWishListButton().isDisplayed();
	}	
	public void deleteButtonClick() {
		this.getDeleteButton().click();
	}
}
