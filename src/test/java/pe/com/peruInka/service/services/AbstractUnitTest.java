package pe.com.peruInka.service.services;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	@Override
	protected String[] getConfigLocations() {
		setPopulateProtectedVariables(true);
		setAutowireMode(AUTOWIRE_BY_TYPE);
		return new String[] {
				"pe/com/comedorUPeU/core/config/application-config.xml",
				"pe/com/comedorUPeU/core/config/applicationContext-dao.xml",
				"pe/com/comedorUPeU/service/config/applicationContext-service.xml"
			};
	}

	public void testApp() {
		assertTrue(true);
		
	}

}
