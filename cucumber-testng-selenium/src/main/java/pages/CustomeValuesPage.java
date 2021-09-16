package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.Utils;

public class CustomeValuesPage {
	WebDriver driver;

	public CustomeValuesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "lbl_val_2")
	WebElement labelFieldValue2;

	@FindBy(id = "lbl_val_3")
	WebElement labelFieldValue3;

	@FindBy(id = "lbl_val_4")
	WebElement labelFieldValue4;

	@FindBy(id = "lbl_val_5")
	WebElement labelFieldValue5;

	@FindBy(id = "txt_val_1")
	WebElement inputField1;

	@FindBy(id = "txt_val_2")
	WebElement inputField2;

	@FindBy(id = "txt_val_3")
	WebElement inputField3;

	@FindBy(id = "txt_val_4")
	WebElement inputField4;

	@FindBy(id = "txt_val_5")
	WebElement inputField5;

	@FindBy(xpath = "//div[@id='custome']/h1")
	WebElement pageHeader;

	@FindBy(id = "lbl_val_1")
	WebElement labelFieldValue1;

	@FindBy(id = "txt_ttl_val")
	WebElement inputTotalBalance;

	/**
	 * @return WebElement
	 */
	public WebElement getInputTotalBalance() {
		return inputTotalBalance;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getPageHeader() {
		return pageHeader;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getLabelFieldValue1() {
		return labelFieldValue1;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getLabelFieldValue2() {
		return labelFieldValue2;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getLabelFieldValue3() {
		return labelFieldValue3;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getLabelFieldValue4() {
		return labelFieldValue4;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getLabelFieldValue5() {
		return labelFieldValue5;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getInputField1() {
		return inputField1;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getInputField2() {
		return inputField2;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getInputField3() {
		return inputField3;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getInputField4() {
		return inputField4;
	}

	/**
	 * @return WebElement
	 */
	public WebElement getInputField5() {
		return inputField5;
	}

	/**
	 * verifying all input field values
	 * 
	 * @return boolean
	 */
	public boolean veriyAllInputFieldValues() {
		double inputVal1 = Utils.convertStringToDouble(inputField1.getAttribute("value"));
		double inputVal2 = Utils.convertStringToDouble(inputField2.getAttribute("value"));
		double inputVal3 = Utils.convertStringToDouble(inputField3.getAttribute("value"));
		double inputVal4 = Utils.convertStringToDouble(inputField4.getAttribute("value"));
		double inputVal5 = Utils.convertStringToDouble(inputField5.getAttribute("value"));
		boolean flag = true;
		if (inputVal1 <= 0 || inputVal2 <= 0 || inputVal3 <= 0 || inputVal4 <= 0 || inputVal5 <= 0) {
			flag = false;
		}
		return flag;
	}

	/**
	 * This method indicates get sumo All input fields
	 * 
	 * @return double
	 */
	public double getSumOAllInputField() {
		double inputVal1 = Utils.convertStringToDouble(inputField1.getAttribute("value"));
		double inputVal2 = Utils.convertStringToDouble(inputField2.getAttribute("value"));
		double inputVal3 = Utils.convertStringToDouble(inputField3.getAttribute("value"));
		double inputVal4 = Utils.convertStringToDouble(inputField4.getAttribute("value"));
		double inputVal5 = Utils.convertStringToDouble(inputField5.getAttribute("value"));

		double sum = inputVal1 + inputVal2 + inputVal3 + inputVal4 + inputVal5;
		return sum;
	}

}
