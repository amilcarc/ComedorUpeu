package pe.com.peruInka.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.comedorUPeU.service.services.CoreUPeUServiceImpl;

public class CoreUPeUServiceImplTest extends AbstractUnitTest{

	
//	logica de negocio de las tablas consumo y reserva
	
	@Autowired
	protected CoreUPeUServiceImpl coreUPeUService;
	
	public void test() {
		System.out.println(coreUPeUService);
	}

}
