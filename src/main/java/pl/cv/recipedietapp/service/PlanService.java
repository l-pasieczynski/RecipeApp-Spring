package pl.cv.recipedietapp.service;

import org.springframework.stereotype.Service;
import pl.cv.recipedietapp.entity.Plan;
import pl.cv.recipedietapp.repository.PlanRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PlanService {
    private final PlanRepository planRepository;

    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }


    public void deletePlan(Long id) {
        Plan plan = findById(id);
        planRepository.delete(plan);
    }

    public void deleteAllUserPlans(){
        planRepository.deleteAll();
    }

    public Plan findById(Long id) {
        return planRepository.getOne(id);
    }

//    public List<Plan> findAllUserPlans() {
//
//        return planRepository.findAllUserPLans(userId);
//    }
}

