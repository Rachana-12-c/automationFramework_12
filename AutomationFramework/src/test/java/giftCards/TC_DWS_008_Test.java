package giftCards;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import objectRepository.HomePage;

public class TC_DWS_008_Test extends BaseClass {
	@Test
	public void computers() throws EncryptedDocumentException, IOException {
		test = extReport.createTest("clickOnGiftCards");
		hp = new HomePage(driver);
		hp.getGiftCardsLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("giftCards", 1, 0),
				"giftCards page is not displayed");
		test.log(Status.PASS, "giftCrads page is displayed");
	}
}
