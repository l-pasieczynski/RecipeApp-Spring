package pl.cv.recipedietapp.service;

import org.springframework.stereotype.Service;
import pl.cv.recipedietapp.entity.Plan;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PlanService {
    private final PlanRepository planRepository;

    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    public void deletePlan(Long planId) {
        Plan plan = findById(planId);
        planRepository.delete(planId);
    }

    public void deleteAllUserPlans(){
        planRepository.deleteAll();
    }

    public Plan findByPlanId(Long planId) {
        return planRepository.findById(planId);
    }

    public List<Plan> findAllUserPlans(Long userId) {
        return planRepository.findAll(userId);
    }
}

