package in.sahil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sahil.entity.CitizenPlan;

public interface CitizenPlanRepo extends JpaRepository<CitizenPlan, Integer> 
{

}
