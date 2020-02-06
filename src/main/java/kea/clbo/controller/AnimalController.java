package kea.clbo.controller;


import kea.clbo.model.Animal;
import kea.clbo.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;

   @GetMapping("/")
    public String index(Model model){
       model.addAttribute("ani", animalRepository.readAll() );
       return "index";
    }

    @GetMapping("/create")
    public String create(){
       return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Animal an){
       animalRepository.create(an);
       return "redirect:/";
    }

}
