package forum.world.hiring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import forum.world.hiring.entity.Hiringstack;
import forum.world.hiring.repo.HiringstackRepository;

@Service
public class HiringstackService {

	@Autowired
	private HiringstackRepository hiringstackRepository;
	
	public Hiringstack insertHiringstackDetails(Hiringstack data){
		
		if(data != null){
			hiringstackRepository.save(data);
		}
		
		return data;
	}	
	
	public List<Hiringstack> fetchAllData(){
		return hiringstackRepository.findAll();
	}
}
