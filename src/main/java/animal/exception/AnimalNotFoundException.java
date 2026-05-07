package animal.exception;

public class AnimalNotFoundException extends RuntimeException{
	public AnimalNotFoundException(String animalKey) {
		super("このキーに対応する動物が見つかりません。リクエストキー : " + animalKey);
	}

}
