package pages;

import org.openqa.selenium.By;

import utility.AppUtils;

public class ReservationPage extends BlazeDemoPage {

	public void navigateToReservationPage() {
		getWebDriverWait();
		verifyFlightButton();
		clickFlightButton();
	}
		
	public String getReservationPageHeader(String source, String destintion) {
		return AppUtils.getWebElement("//h3[normalize-space()='Flights from "+source+" to "+destintion+":']").getText();
	}
		
	public boolean verifyChooseFlightButton() {
		return AppUtils.verifyElementPresence(chooseFlightButton);
	}
	
	public void clickChooseFlightButton() {
		 AppUtils.getWebElement(chooseFlightButton).click();
		 
	}
}
