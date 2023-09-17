package game.me.skin;


/**
 * 皮肤等级
 *
 * @author zh
 */
public enum SkinGradeEnum {

    NORMAL_LEVEL(1, "普通级别"),
    HERO_LEVEL(2, "英雄级别"),
    LEGEND_LEVEL(3, "神话级别"),
    EPIC_LEVEL(4, "史诗级别"),
    COLLECTION_LEVEL(5, "典藏级别");

    private int grade;
    private String description;

    /**
     * 等级
     */
    public int getGrade() {
        return grade;
    }

    /**
     * 描述
     */
    public String getDescription() {
        return description;
    }

    SkinGradeEnum(int grade, String description) {
        this.grade = grade;
        this.description = description;
    }
}
