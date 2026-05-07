package animal.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import animal.model.Animal;

@Service
public class AnimalInfoGetService {
	
	private final Map<String,Animal> animalMap = new HashMap<>();
	
	public AnimalInfoGetService() {
		animalMap.put("MikeNeko", new Animal("三毛猫","猫","可愛い日本猫",15));
		animalMap.put("ShibaInu", new Animal("芝犬","犬","もふもふな日本犬",15));		
	}
	
	// 登録中の動物一覧
	public List<Animal> getAnimalList(){
		return new ArrayList<>(animalMap.values());
	}
	
	// 指定した動物の情報を取得
	public Animal getByOneAnimal(String animalKey) {		
		Animal animal = animalMap.get(animalKey);
		
		return animal;
	}

	
}
