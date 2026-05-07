package animal.data;

public class AnimalSummary {

    private String requestKey; //APIリクエストキー
    private String species;    //種別名（例：三毛猫）

    // デフォルトコンストラクタ
    public AnimalSummary() {
    }

    // 全引数コンストラクタ
    public AnimalSummary(String requestKey, String species) {
        this.requestKey = requestKey;
        this.species = species;
    }

    // getter
    public String getRequestKey() {
        return requestKey;
    }

    public String getSpecies() {
        return species;
    }

    // setter
    public void setRequestKey(String requestKey) {
        this.requestKey = requestKey;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}