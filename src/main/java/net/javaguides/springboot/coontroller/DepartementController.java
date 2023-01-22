package net.javaguides.springboot.coontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springboot.entity.Departement;
import net.javaguides.springboot.repository.DepartementRepository;

@Controller
public class DepartementController {
	//Oussama EL Idrissi
	@Autowired
	private DepartementRepository repo;
	
	@GetMapping("/departement")
	public String listDepartement(Model model) {
		List<Departement> listDepartements = repo.findAll();
		model.addAttribute("listDepartements", listDepartements);
		
		return "departement";
	}
	
	@GetMapping("/departements/new")
	public String showDepartementNewForm(Model model) {
		
		model.addAttribute("departement", new Departement());
		model.addAttribute("added", true);
		
		return "departement_form";
	}
	
	@PostMapping("/departements/save")
	public String saveDepartement(Departement departement) {
		repo.save(departement);
		return "redirect:/departement";
	}
	
	@GetMapping("/departements/edit/{id}")
	public String showEditDepartementForm(@PathVariable("id") Integer id, Model model) {
		Departement departement =repo.findById(id).get();
		model.addAttribute("departement", departement);
		model.addAttribute("edit", true);
		
		List<Departement> listDepartements =repo.findAll();
		
		model.addAttribute("listDepartements", listDepartements);
		return "departement_form";
	}
	
	@GetMapping("/departements/delete/{id}")
	public String deleteDepartement(@PathVariable("id") Integer id, Model model) {
		
		repo.deleteById(id);
		return "redirect:/departement";
	}
	
	

}
