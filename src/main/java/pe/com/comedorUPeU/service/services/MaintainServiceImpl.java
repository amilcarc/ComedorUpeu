package pe.com.comedorUPeU.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.comedorUPeU.core.dao.MaintainDAO;
import pe.com.comedorUPeU.core.domain.Comensal;
import pe.com.comedorUPeU.core.domain.Person;
import pe.com.comedorUPeU.core.domain.StatusComensal;
import pe.com.comedorUPeU.core.domain.StatusPerson;
import pe.com.comedorUPeU.core.domain.TypeDocument;

@Service("maintainService")
public class MaintainServiceImpl {
	
	public static List<Person> listPerson = new ArrayList<Person>();

	@Autowired
	private MaintainDAO maintainDAO;
	
	
	public void deleteUserSystem(Long id) {
		Comensal comensal  = maintainDAO.findComensalById(id);
		maintainDAO.deleteComensal(comensal);
	}

	public Comensal findComensalId(Long id) {
		return maintainDAO.findComensalById(id);
	}

	public List<StatusComensal> findStatusComensal() {
		return maintainDAO.findStatusComensal();
	}
	
	public List<Comensal> findComensal() {
		return maintainDAO.findComensal();
	}

	public List<TypeDocument> findTypeDocument() {
		return maintainDAO.findTypeDocument();
	}

	public List<StatusPerson> findStatusPerson() {
		return maintainDAO.findStatusPerson();
	}

	public List<pe.com.comedorUPeU.core.domain.Person> findAllPerson() {
		return maintainDAO.findAllPerson();
		// return listPerson;
	}

	public void savePerson(pe.com.comedorUPeU.core.domain.Person person) {
		// listPerson.add(person);
		maintainDAO.savePerson(person);
	}



	public void saveComensal(Comensal comensal) {
		if (comensal.getId() == null) {
			maintainDAO.saveComensal(comensal);
		} else {
			maintainDAO.updateComensal(comensal);
		}
	}

	public void deletePerson(Long id) {
		// peruInkaDAO.deletePerson(id);
		List<Person> listPersoTemp = new ArrayList<Person>();

		for (Person person : listPerson) {
			if (id.compareTo(person.getId()) != 0) {
				listPersoTemp.add(person);
			}
		}
		listPerson = new ArrayList<Person>();
		listPerson.addAll(listPersoTemp);
	}

	public void updatePerson(Person personUpdate) {
		List<Person> listTemp = new ArrayList<Person>();

		for (Person person : listPerson) {
			if (personUpdate.getId().compareTo(person.getId()) == 0) {
				listTemp.add(personUpdate);
			} else {
				listTemp.add(person);
			}
		}
		listPerson = new ArrayList<Person>();
		listPerson.addAll(listTemp);

	}

	public Person searchPerson(Long id) {
		Person personReturn = new Person();
		for (Person person : listPerson) {
			if (id.compareTo(person.getId()) == 0) {
				personReturn = person;
				continue;
			}
		}
		return personReturn;
	}

}
