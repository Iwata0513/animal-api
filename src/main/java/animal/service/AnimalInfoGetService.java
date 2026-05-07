package animal.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import animal.model.Animal;
import animal.data.AnimalSummary;

@Service
public class AnimalInfoGetService {
	
	private final Map<String,Animal> animalMap = new HashMap<>();
	private final List<AnimalSummary> animalSummaryList = new ArrayList<>();
	
	public AnimalInfoGetService() {
		// 動物の情報全てを設定
		animalMap.put("mikeneko", new Animal("三毛猫","猫","可愛い日本猫",15));
		animalMap.put("shibainu", new Animal("芝犬","犬","もふもふな日本犬",15));
		
		// サマリ情報を生成
		for(Map.Entry<String,Animal> entry : animalMap.entrySet()) {
			AnimalSummary animal = new AnimalSummary(entry.getKey(), entry.getValue().getSpecies());
			animalSummaryList.add(animal);
		}
	}
	
	// 登録中の動物一覧
	public List<AnimalSummary>  getAnimalSummaries(){
		return animalSummaryList;
	}
	
	// 登録中の動物情報全て
	public List<Animal> getAllAnimals(){
		return new ArrayList<>(animalMap.values());
	}
	
	// 指定した動物の情報を取得
	public Animal getByOneAnimal(String animalKey) {		
		Animal animal = animalMap.get(animalKey);
		
		return animal;
	}

	
}
