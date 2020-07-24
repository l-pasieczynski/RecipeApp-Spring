package pl.cv.recipedietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.cv.recipedietapp.service.PlanService;

@Controller
@RequestMapping("app")
public class PlanController {
    private final PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping("/plan")
    public String recipes(Model model){
//        model.addAttribute("plan",planService.findAllUserPlans();
        return "app/plan/plan";
    }

}
