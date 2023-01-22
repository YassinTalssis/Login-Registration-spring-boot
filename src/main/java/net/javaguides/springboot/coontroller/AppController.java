package net.javaguides.springboot.coontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.springboot.sms.data.*;
//import com.springboot.sms.entity.Student;
//import com.springboot.sms.repository.DepartementRepository;
import net.javaguides.springboot.repository.StudentRepository;

import net.javaguides.springboot.repository.DepartementRepository;

@Controller
public class AppController {
	//Aissa Chbaba
	@Autowired
	DepartementRepository studentRepository;
	
	@Autowired
	DepartementRepository departementRepository;

	@Autowired
	private StudentRepository repo;
	List<?> report = new ArrayList<>();
	Map<String, ?> map = new HashMap<>();
	
	
	public AppController() {
		
	}
	/*@GetMapping("")
	public String viewHomePage(Model model) {
		
		
		String var=studentRepository.StudentsNBR();
		model.addAttribute("var", var);
		String dp = departementRepository.DepartementNBR();
		model.addAttribute("dp", dp);
		
		return "index";
	}

	
	/*@GetMapping("/reportByDepartement")
	@ResponseBody
	public List<?> getReport() {
		List<?> report = null;
		report = studentRepository.reportByDepartement();
		return report;
	}*/
	
//	@GetMapping("/numberStudent")
//	@ResponseBody
//	public String getStudentNumber(Model model){
//		String repot = null;
//		repot = studentRepository.StudentsNBR();
//		model.addAttribute("repot", repot);
//		return repot;
//	}
}
