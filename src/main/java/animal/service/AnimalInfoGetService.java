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
	private final Map<String,String> animalMapSummary = new HashMap<>();
	
	public AnimalInfoGetService() {
		// 動物の情報全てを設定
		animalMap.put("MikeNeko", new Animal("三毛猫","猫","可愛い日本猫",15));
		animalMap.put("ShibaInu", new Animal("芝犬","犬","もふもふな日本犬",15));
		
		// サマリ情報を生成
		for(Map.Entry<String,Animal> entry : animalMap.entrySet()) {
			animalMapSummary.put(entry.getKey(), entry.getValue().getSpecies());
		}
	}
	
	// 登録中の動物一覧
	public Map<String,String>  getAnimalSummaryList(){
		return animalMapSummary;
	}
	
	// 登録中の動物情報全て
	public List<Animal> getAnimalAllInfoList(){
		return new ArrayList<>(animalMap.values());
	}
	
	// 指定した動物の情報を取得
	public Animal getByOneAnimal(String animalKey) {		
		Animal animal = animalMap.get(animalKey);
		
		return animal;
	}

	
}
