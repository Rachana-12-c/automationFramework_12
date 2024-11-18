package computers;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import genericUtility.ListenersUtility;
import objectRepository.HomePage;

@Listeners(ListenersUtility.class)
public class TC_DWS_006_Test extends BaseClass {
	@Test
	public void computers() throws EncryptedDocumentException, IOException {

		hp = new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("computers", 1, 0),
				"computers page is not displayed");
		test.log(Status.PASS, "computers page is displayed");
	}

}
