package dental;

import co.th.geniusterr.DentalApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DentalApplication.class)
@WebAppConfiguration
public class DentalApplicationTests {

	@Test
	public void contextLoads() {
	}

}
