package specs.unit;

import java.util.Calendar;
import junit.framework.Assert;
import org.junit.Test;
import utils.CalendarUtils;


public class CalendarUtilsSpec {
	
	@Test
	public void deveCalcularDias () {
		
		Calendar start = Calendar.getInstance();
		start.set(1977, 8, 8);
		
		Calendar end = Calendar.getInstance();
		end.set(1977, 8, 20);
		
		Assert.assertEquals(12, CalendarUtils.days(start, end));
		
	}

}
