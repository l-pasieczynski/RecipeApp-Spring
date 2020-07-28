package pl.cv.recipedietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.cv.recipedietapp.entity.Plan;
import pl.cv.recipedietapp.service.PlanService;

@Controller
@RequestMapping("app")
@SessionAttributes({"userId"})
public class PlanController {
    private final PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping("/plan")
    public String recipes(@ModelAttribute("userId") Long userId, Model model) {
        model.addAttribute("plan", planService.findAll());
        return "app/plan/plan";
    }

    @GetMapping("/plan/add")
    public String addPlan(Model model){
        model.addAttribute("plan", new Plan());
        return "app/plan/planForm";
    }

    @PostMapping("plan/add")
    public String addPlanPost(@ModelAttribute("plan") Plan plan){
        planService.create(plan);
        return "redirect:../plan";
    }

    @GetMapping("/plan/delete/{id}")
    public String delete(Model model){
        String decision = "";
        model.addAttribute("decision", decision);
        return "app/plan/planDelete";
    }

    @PostMapping("/plan/delete/{id}")
    public String deletePost(@PathVariable Long id, @ModelAttribute("decision") String decision){
        if(decision.equals("OK")){
            planService.deletePlan(id);
        }
        return "redirect:../";
    }

    @GetMapping("/plan/details/{id}")
    public String planDetails(@PathVariable("id") Long id, Model model) {
        Plan plan = planService.findById(id);
        model.addAttribute("plan", plan);
        return "/app/plan/planDetails";
    }

    @GetMapping("plan/edit/{id}")
    public String editPlan(Model model, @PathVariable Long id) {
        Plan plan = planService.findById(id);
        model.addAttribute("plan", plan);
        return "app/plan/planForm";
    }

    @PostMapping("plan/edit/{id}")
    public String updatePlan(@ModelAttribute("plan") Plan plan) {
        planService.create(plan);
        return "redirect:../";
    }

}
