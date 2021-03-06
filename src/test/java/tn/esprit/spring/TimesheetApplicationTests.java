package tn.esprit.spring;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.Timesheet;
import tn.esprit.spring.repository.ContratRepository;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EmployeRepository;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.repository.MissionRepository;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;
import tn.esprit.spring.services.IDepartementService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TimesheetApplicationTests {
	@Autowired 
	IEmployeService iemployeservice; 

	@Autowired 
	IEntrepriseService ientrepriseservice;
	
	@Autowired 
	IDepartementService idepartementservice;
	
	@Autowired
	EmployeRepository employerepository;

	@Autowired
	DepartementRepository departementrepository;

	@Autowired
	MissionRepository missionrepository;
	
	@Autowired
	ContratRepository contratrepository;
	
	@Autowired
	EntrepriseRepository entrepriserepository;
	
	@Autowired
	DepartementRepository deptRepoistory;
	 /*****************************partie dorra***************************************/
/*
	@Test
	public void contextLoads() {
	}
	*/
	/*
	@Test
	public void testdeleteContratById() {
	
				Contrat c = new Contrat(1, "typ1", 2);
				iemployeservice.ajouterContrat(c);
				iemployeservice.deleteContratById(c.getReference());
				assertNull(employerepository.findById(c.getReference()));
}
*/
	/*
	
	@Test
	public void getNombreEmployeJPQL() {
		
				Employe e1 = new Employe("salah", "salah", "s.s@gmail.tn", true, Role.INGENIEUR);
				Employe e2 = new Employe("mohamed", "mohamed", "m.m@gmail.tn", true, Role.ADMINISTRATEUR);
				iemployeservice.addOrUpdateEmploye(e1);
				iemployeservice.addOrUpdateEmploye(e2);
				int nbr = iemployeservice.getNombreEmployeJPQL() ;
				assertEquals(3, nbr);
}
	*/
	/*
	
	@Test
	public void getAllEmployeNamesJPQL() {
		
				List<String> L = iemployeservice.getAllEmployeNamesJPQL();
				String name = L.get(0);
				assertEquals("a", name);
			}
	*/
	/*
	@Test
	public void getAllEmployes() {
		
				List<Employe> L = iemployeservice.getAllEmployes();
				
				assertEquals(1, L.size());
			}
		
	*/
	/*

	@Test
	public void getAllEmployeByEntreprise() {
		
				Entreprise E = entrepriserepository.findById(1).get();
				List<Employe> L = iemployeservice.getAllEmployeByEntreprise(E);
				String name = L.get(0).getNom();
				assertEquals("a", name);
			}
	*/
	/*
	@Test
	public void mettreAjourEmailByEmployeIdJPQL() {
		
				
				int id = employerepository.findById(1).get().getId();
				iemployeservice.mettreAjourEmailByEmployeIdJPQL("new.new@gmail.tn", id);
				assertEquals("new.new@gmail.tn", employerepository.findById(1).get().getEmail());
			}
	*/
	
	/*
	 public static Date parseDate(String date) {
	     try {
	         return new SimpleDateFormat("yyyy-MM-dd").parse(date);
	     } catch (ParseException e) {
	         return null;
	     }
	  }
	  */
	/*
	 @Test
		public void deleteAllContratJPQL() {
			
		iemployeservice.deleteAllContratJPQL() ;
		assertNull(contratrepository.findAll() );
				
	 }
	
	*/
	 /*
	 @Test
		public void getSalaireByEmployeIdJPQL() {
			
		
		assertEquals(200, iemployeservice.getSalaireByEmployeIdJPQL(employerepository.findById(1).get().getId()));
				
	 }
	 */
	/* 
	 @Test
		public void getTimesheetsByMissionAndDate() {
		 
		Employe e = employerepository.findById(1).get();
		Mission m = missionrepository.findById(1).get();
		Date dateDebut = parseDate("2010-01-01");
		Date dateFin = parseDate("2025-01-01");
		 
		
	    List<Timesheet> t = iemployeservice.getTimesheetsByMissionAndDate(e, m, dateDebut, dateFin) ;
	    assertNotNull(t);
				
	 }
	*/
	 /*****************************fin partie dorra***************************************/
	
	
	 
	 
	 /*****************************d??but partie Njah***************************************/
	 /*@Test
		public void testauthenticate() {
		
		 Employe e1 = new Employe("salah", "salah", "s.s@gmail.tn","pass", true, Role.INGENIEUR);
			iemployeservice.addOrUpdateEmploye(e1);
			Employe e = iemployeservice.authenticate("salah", "pass");
			System.out.println("************************************************************************");
			if (e == null)	
			System.out.println("nuuuuuuuuuuuuuuuuullll");
					assertEquals("salah", e.getNom());
	}*/
	 /*@Test
		public void testaddOrUpdateEmploye() {
		 int nbr = iemployeservice.getNombreEmployeJPQL() ;
			Employe e2 = new Employe("mohamed", "mohamed", "m.m@gmail.tn", true, Role.ADMINISTRATEUR);
			iemployeservice.addOrUpdateEmploye(e2);
		
			assertEquals(nbr+1, iemployeservice.getNombreEmployeJPQL());
	}*/
	 /*@Test
		public void testmettreAjourEmailByEmployeId() {
					int id = employerepository.findById(16).get().getId();
					iemployeservice.mettreAjourEmailByEmployeId("new.new@gmail.tn", id);
					assertEquals("new.new@gmail.tn", employerepository.findById(16).get().getEmail());
				}*/
	/* @Test
		public void testaffecterEmployeDuDepartement() {
			iemployeservice.affecterEmployeADepartement(15,1);
			Departement dep = deptRepoistory.findById(1).get();
			Employe employe = employerepository.findById(15).get();
			
			int id1 = employe.getDepartements().get(0).getId();
		
					assertEquals(1,id1);
				}*/
	 /*@Test
		public void testdesaffecterEmployeDuDepartement() {
			iemployeservice.desaffecterEmployeDuDepartement(15,1);
			Departement dep = deptRepoistory.findById(1).get();
			Employe employe = employerepository.findById(15).get();
			
					assertEquals("", employe.getDepartements());
					
				}*/
	 /*@Test
		public void testdeleteEmployeById() {
		int nbr = iemployeservice.getNombreEmployeJPQL() ;
		iemployeservice.deleteEmployeById(19);
		
		assertEquals(nbr-1, iemployeservice.getNombreEmployeJPQL());
	 }*/
	 /*@Test
		public void testajouterContrat() {
		int nbr = contratrepository.countcont() ;
		Contrat c = new Contrat(1, "typ1", 2);
		iemployeservice.ajouterContrat(c);
		
		assertEquals(nbr+1, contratrepository.countcont());
	 }*/
	 
	
	
	
	
	
	 /*****************************fin partie Njah***************************************/
	 /*****************************d??but partie Ghassen***************************************/
	/*
 @Test
		public void testajouterEntreprise() {
		int nb = entrepriserepository.countent() ;
		Entreprise ent = new Entreprise(7, "Google111", "info");
		ientrepriseservice.ajouterEntreprise(ent);
		
		assertEquals(nb+1, entrepriserepository.countent());
	 }
*/
/*
@Test
		public void testajouterDepartment() {
		int nb = departementrepository.countdep() ;
		Entreprise ent = ientrepriseservice.getEntrepriseById(1);
		Departement dep = new Departement(5, "Dev", ent);
		ientrepriseservice.ajouterDepartement(dep);
		
		assertEquals(nb+1, departementrepository.countdep());
	 }
*/
/*
@Test
	
		public void testdeleteEntrepriseById() {
		int nb = entrepriserepository.countent() ;
		ientrepriseservice.deleteEntrepriseById(2);
		
		assertEquals(nb-1, entrepriserepository.countent());
	 }
*/
/*@Test
	
		public void testdeleteDepartementById() {
		int nb = departementrepository.countdep() ;
		idepartementservice.deletedepartementById(2);
		
		assertEquals(nb-1, departementrepository.countdep());
	 }*/	
/*
 @Test
		public void testaffecterDepartementAEntreprise() {
			ientrepriseservice.affecterDepartementAEntreprise(1,1);
			Entreprise ent = entrepriserepository.findById(1).get();
			Departement dep = deptRepoistory.findById(1).get();
			
			int id = ent.getDepartements().get(0).getId();
			assertEquals(1,id);
				} 
*/
/*
@Test
	public void getAllDepartementByEntreprise() {
		
				Entreprise E = entrepriserepository.findById(1).get();
				List<Departement> L = E.getDepartements();
				String name = L.get(0).getName();
				assertEquals("Dev", name);
			}
	
*/
 /*****************************fin partie Ghassen***************************************/
}
