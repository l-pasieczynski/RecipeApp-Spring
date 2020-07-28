package pl.cv.recipedietapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import pl.cv.recipedietapp.EntityNotFoundException;
import pl.cv.recipedietapp.entity.Plan;
import pl.cv.recipedietapp.repository.PlanRepository;

import java.util.List;

@Service
public class PlanService {
    private final PlanRepository planRepository;

    @Autowired
    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }


    public void deletePlan(Long id) {
        Plan plan = findById(id);
        planRepository.delete(plan);
    }

    public void deleteAllUserPlans() {
        planRepository.deleteAll();
    }

    public Plan findById(Long id){
        return planRepository.getOne(id);
    }

//    public Plan findById(Long id) {
//        return planRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id, Plan.class.getSimpleName()));
//    }

    public void create(Plan plan) {
        planRepository.save(plan);
    }

    public List<Plan> findAll() {
        return planRepository.findAll();
    }

    public List<Plan> findAllUserPlans(Long userId) {
        return planRepository.findAllByUserIdOrderByCreatedDesc(userId);
    }
}

