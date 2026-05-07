package animal.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import animal.data.AnimalSummary;
import animal.model.Animal;
import animal.service.AnimalInfoGetService;

@RestController
public class AnimalController {
	
	private  final AnimalInfoGetService animalInfoGetService;
	
	public AnimalController(AnimalInfoGetService animalInfoGetService) {
		this.animalInfoGetService = animalInfoGetService;
	}

	//登録中の動物一覧 動物名とリクエストキーのみ
    @GetMapping("/animals/summary")
    public List<AnimalSummary> getAnimalSummaryList() {
        return animalInfoGetService.getAnimalSummaries();
    }
	
	//登録中の動物情報全て
    @GetMapping("/animals")
    public List<Animal> getAnimalAllInfoList() {
        return animalInfoGetService.getAllAnimals();
    }
    
    // 動物の情報取得
    @GetMapping("/animals/{animalkey}")
    public Animal getByOneAnimal(@PathVariable("animalkey") String animalkey) {
        return animalInfoGetService.getByOneAnimal(animalkey);
    }
    
    

}
