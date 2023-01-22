package net.javaguides.springboot.coontroller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


//import net.lowagie.text.DocumentException;
import net.javaguides.springboot.entity.Departement;
import net.javaguides.springboot.repository.DepartementRepository;
import net.javaguides.springboot.repository.StudentRepository;
import net.javaguides.springboot.service.StudentService;
//import com.springboot.sms.util.StudentPDFExporter;

import net.javaguides.springboot.entity.Student;

@Controller
public class StudentController {
	//Aissa chbaba
	@Autowired
	private StudentRepository studenttrepo;
	
	@Autowired
	private StudentService repo;
	
	@Autowired
	private DepartementRepository departementRepo;
	
	@GetMapping("/students/new")
	public String showNewStudentForm(Model model) {
		List<Departement> listDepartements =departementRepo.findAll();
		
		model.addAttribute("student", new Student());
		model.addAttribute("listDepartements", listDepartements);
		model.addAttribute("added", true);
		
		return "create_student";
	}
	
	@PostMapping("/students/save")
	public String saveStudent(Student student) {
		studenttrepo.save(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students")
	public String listStudent(Model model) {
		
		List<Student> listStudents = studenttrepo.findAll();
		model.addAttribute("listStudents", listStudents);
		
		return "students";
	}
	
	
	@GetMapping("/students/edit/{id}")
	public String showEditStudentForm(@PathVariable("id") Integer id, Model model) {
		Student student =studenttrepo.findById(id).get();
		model.addAttribute("student", student);
		model.addAttribute("edit", true);
		
		List<Departement> listDepartements =departementRepo.findAll();
		
		model.addAttribute("listDepartements", listDepartements);
		return "student_form";
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable("id") Integer id, Model model) {
		
		studenttrepo.deleteById(id);
		return "redirect:/students";
	}
	
}
