package animal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import animal.model.Animal;
import animal.service.AnimalInfoGetService;

@RestController
public class AnimalController {
	
	private  final AnimalInfoGetService animalInfoGetService;
	
	public AnimalController(AnimalInfoGetService animalInfoGetService) {
		this.animalInfoGetService = animalInfoGetService;
	}

	//登録中の動物一覧
    @GetMapping("/AnimalList")
    public List<Animal> AnimalList() {
        return animalInfoGetService.getAnimalList();
    }
    
    // 動物の情報取得
    @GetMapping("/{animalkey}")
    public Animal getByOneAnimal(@PathVariable("animalkey") String animalkey) {
        return animalInfoGetService.getByOneAnimal(animalkey);
    }
    
    

}
