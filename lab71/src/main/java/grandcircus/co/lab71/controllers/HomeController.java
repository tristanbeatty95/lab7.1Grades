package grandcircus.co.lab71.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import grandcircus.co.lab71.model.Grades;
import grandcircus.co.lab71.repositories.GradeRepository;

@Controller
public class HomeController {
	
	@Autowired
	private GradeRepository repo;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Grades> grades = repo.findAll();
		int size = grades.size();
		model.addAttribute("grades", grades);
		model.addAttribute("size", size);
		return "homepage";
	}
	
	@RequestMapping("/delete")
	public String deleteGrade(@RequestParam String id) {
		repo.deleteById(id);
		return "redirect:/";
	}
	
	@RequestMapping("/addGrade")
	public String addGrade() {
		return "addGrade";
	}
	
	@RequestMapping("/confirmGrade")
	public String confirmGrade(@RequestParam String name, @RequestParam String type, 
								@RequestParam double score, @RequestParam double total, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("type", type);
		model.addAttribute("score", score);
		model.addAttribute("total", total);
		Grades grade = new Grades(name, type, score, total);
		repo.insert(grade);
		return "confirmGrade";
	}
	

}
