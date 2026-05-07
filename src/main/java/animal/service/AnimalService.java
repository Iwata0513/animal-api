package animal.service;

import org.springframework.stereotype.Service;

import animal.model.Animal;

@Service
public class AnimalService {
	
	// 三毛猫の情報を取得
	public Animal getMikeNeko() {		
		Animal mikeNeko = new Animal("三毛猫","猫","可愛い日本猫",15);		
		return mikeNeko;
	}

}
