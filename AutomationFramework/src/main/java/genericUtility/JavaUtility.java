package genericUtility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	/**
	 * This method is used to capture the current system date and time
	 * @return String
	 */
	public String getSystemTime()
	{
		return LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * This method is used to generate the random number within the specified number
	 * @return int
	 */
	public int getRandamNumber()
	{
		Random ran=new Random();
	return ran.nextInt(1000);
	}
}
