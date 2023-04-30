package com.sid.patient.web;

import com.sid.patient.dao.PatientRepository;
import com.sid.patient.entities.Patient;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@AllArgsConstructor
public class PatientController {
    private PatientRepository patientRepository;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page",defaultValue = "0") int  page,
                        @RequestParam(name = "size", defaultValue = "15") int size,
                        @RequestParam(name = "keyword", defaultValue = "") String kw

    ){
        Page<Patient> patientPage= patientRepository.findByNameContains(kw,PageRequest.of(page,size));
        model.addAttribute("patients",patientPage);
        model.addAttribute("pages",new int[patientPage.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",kw);
        return  "index";
    }
  @GetMapping("/delete")
    public String delete(Long id,String keyword,Integer page){
        patientRepository.deleteById(id);
        return "redirect:/?page="+page+"&keyword="+keyword;
    }
    @GetMapping("/formPatients")
    public String addPatient(Model model){
        Patient patient= new Patient();
        model.addAttribute("patient",patient);
        return "formPatient";
    }
    @PostMapping("/save")
    public String save(Model model, @Valid Patient patient, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
          return  "formPatient";

        }
        patientRepository.save(patient);
        return "redirect:/formPatients";
    }
}
