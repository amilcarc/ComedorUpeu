package pe.com.peruInka.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.comedorUPeU.service.services.MaintainServiceImpl;

public class MaintainServiceImplTest extends AbstractUnitTest {

	@Autowired
	private MaintainServiceImpl maintainService;

	
//	Mantenimiento de Usuario, Comensal, horario
	public void test() {
		System.out.println(maintainService);
	}
	
}
