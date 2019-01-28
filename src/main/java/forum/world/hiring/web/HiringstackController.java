package forum.world.hiring.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import forum.world.hiring.entity.Hiringstack;
import forum.world.hiring.service.HiringstackService;

@RestController
@RequestMapping(value="/hiringstack/hiringstack")
public class HiringstackController {

	@Autowired
	private HiringstackService hiringstackService;
	
	@CrossOrigin
	@GetMapping(path = "/")
	public List<Hiringstack> fetchAllData(){
		
		return hiringstackService.fetchAllData();
	}
	
	@CrossOrigin
	@PostMapping(path = "/")
	public Hiringstack insertHiringstackDetails(@RequestBody Hiringstack data){
		
		return hiringstackService.insertHiringstackDetails(data);
	}
	
}
