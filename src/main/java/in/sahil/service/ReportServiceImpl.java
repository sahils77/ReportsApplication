package in.sahil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sahil.entity.CitizenPlan;
import in.sahil.repo.CitizenPlanRepo;
import in.sahil.request.SearchRequest;

@Service
public class ReportServiceImpl implements ReportsService {
	
	@Autowired
	private CitizenPlanRepo repo;

	@Override
	public List<String> getPlanNames() {
		
		//List<String> planData=getPlanNames();
		return null;
	}

	@Override
	public List<String> getPlanStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}

}
