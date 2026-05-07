package animal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import animal.model.Animal;
import animal.service.AnimalService;

@RestController
public class AnimalController {
	
	private  final AnimalService servise;
	
	public AnimalController(AnimalService service) {
		this.servise = service;
	}

	//登録中の動物一覧
    @GetMapping("/AnimalList")
    public String AnimalList() {
        return "準備中";
    }
    
    // 三毛猫の情報取得
    @GetMapping("/MikeNeko")
    public Animal MikeNeko() {
        return servise.getMikeNeko();
    }
    
    

}
