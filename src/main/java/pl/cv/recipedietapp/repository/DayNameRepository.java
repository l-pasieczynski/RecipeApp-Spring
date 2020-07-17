package pl.cv.recipedietapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cv.recipedietapp.entity.DayName;

@Repository
public interface DayNameRepository extends JpaRepository<DayName, Integer> {

}
