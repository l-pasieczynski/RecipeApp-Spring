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

}

