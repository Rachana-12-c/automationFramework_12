package books;

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
public class TC_DWS_005_Test extends BaseClass {
	@Test
	public void books() throws EncryptedDocumentException, IOException {
		hp = new HomePage(driver);
		hp.getBooksLink().click();
		Assert.assertNotEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Books", 1, 0),
				"Books page is not displayed");
		test.log(Status.PASS, "Books page is displayed");
	}
}
