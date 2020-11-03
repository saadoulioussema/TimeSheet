package tn.esprit.spring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.dto.MissionDTO;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.Timesheet;
import tn.esprit.spring.mapper.TimesheetMapper;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;
import tn.esprit.spring.services.ITimesheetOneService;
import tn.esprit.spring.services.ITimesheetTwoService;

@RestController
public class RestControlTimesheet {

	@Autowired
	IEmployeService iemployeservice;
	@Autowired
	IEntrepriseService ientrepriseservice;
	@Autowired
	ITimesheetOneService itimesheetoneservice;
	@Autowired
	ITimesheetTwoService itimesheettwoservice;
	@Autowired
    TimesheetMapper timesheetMapper;
	
	// http://localhost:8081/SpringMVC/servlet/ajouterMission
	@PostMapping("/ajouterMission")
	@ResponseBody
	public int ajouterMission(@RequestBody MissionDTO e)  {
		Mission mission = timesheetMapper.mapMissionDtoToMission(e);
		itimesheetoneservice.ajouterMission(mission);
		return mission.getId();
	}

	// http://localhost:8081/SpringMVC/servlet/affecterMissionADepartement/4/4
	@PutMapping(value = "/affecterMissionADepartement/{idmission}/{iddept}") 
	public void affecterMissionADepartement(@PathVariable("idmission") int missionId, @PathVariable("iddept") int depId) {
		itimesheetoneservice.affecterMissionADepartement(missionId, depId);
	}
	
	// http://localhost:8081/SpringMVC/servlet/ajouterTimesheet
	
	@PostMapping("/ajouterTimesheet/idmission/idemp/dated/datef")
	@ResponseBody
	public Timesheet ajouterTimesheet(@PathVariable("idmission") int missionId, @PathVariable("idemp") int employeId, @PathVariable("dated") Date dateDebut,@PathVariable("datef") Date dateFin) {
		Timesheet t = itimesheetoneservice.ajouterTimesheet(missionId, employeId, dateDebut, dateFin);
		return t;
	}

	// http://localhost:8081/SpringMVC/servlet/validerTimesheet/1/1/03-10-2020/03-20-2020/1
	@PutMapping(value = "/validerTimesheet/{idmission}/{idemp}/{dated}/{datef}/{idval}") 
	public void validerTimesheet(@PathVariable("idmission") int missionId, @PathVariable("idemp") int employeId, @PathVariable("dated") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut,@PathVariable("datef") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin, @PathVariable("idval") int validateurId) {
		itimesheettwoservice.validerTimesheet(missionId, employeId, dateDebut, dateFin, validateurId);
	}
	
	// URL : http://localhost:8081/SpringMVC/servlet/findAllMissionByEmployeJPQL/1
    @GetMapping(value = "findAllMissionByEmployeJPQL/{idemp}")
    @ResponseBody
	public List<Mission> findAllMissionByEmployeJPQL(@PathVariable("idemp") int employeId) {

		return itimesheettwoservice.findAllMissionByEmployeJPQL(employeId);
	}

    // URL : http://localhost:8081/SpringMVC/servlet/getAllEmployeByMission/1
    @GetMapping(value = "getAllEmployeByMission/{idmission}")
    @ResponseBody
	public List<Employe> getAllEmployeByMission(@PathVariable("idmission") int missionId) {

		return itimesheettwoservice.getAllEmployeByMission(missionId);
	}
}
