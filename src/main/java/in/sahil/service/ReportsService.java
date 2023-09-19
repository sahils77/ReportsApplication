package in.sahil.service;

import java.util.List;

import in.sahil.entity.CitizenPlan;
import in.sahil.request.SearchRequest;

public interface ReportsService 
{

	public List<String> getPlanNames();
	
    public List<String> getPlanStatus();
    
    public List<CitizenPlan> search(SearchRequest request);
    
    public boolean exportExcel();
    
    public boolean exportPdf();
	
}
