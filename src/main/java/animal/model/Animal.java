package animal.model;

public class Animal {

    private String species;           // 種別名（例：三毛猫）
    private String category;          // 大分類（例：猫）
    private String description;       // 説明
    private Integer averageLifespan;  // 平均寿命（年）

    // デフォルトコンストラクタ
    public Animal() {
    }

    // 全引数コンストラクタ
    public Animal(String species, String category, String description, Integer averageLifespan) {
        this.species = species;
        this.category = category;
        this.description = description;
        this.averageLifespan = averageLifespan;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAverageLifespan() {
        return averageLifespan;
    }

    public void setAverageLifespan(Integer averageLifespan) {
        this.averageLifespan = averageLifespan;
    }
}