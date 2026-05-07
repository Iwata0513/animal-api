package animal.data;

import lombok.Data;

@Data
public class AnimalData {
    private String species;         // 種別名（例：三毛猫）
    private String category;        // 大分類（例：猫）
    private String description;     // 説明
    private Integer averageLifespan; // 平均寿命（年）
}
