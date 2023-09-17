package game.me.voice.sound;

/**
 * 音效类型
 *
 * @author zh
 */
public enum SoundClassificationEnum {

    RANDOM(1, "没有战斗"),
    RELEASE_SKILLS(2, "释放技能");


    private int classification;

    private String description;

    /**
     * 分类
     */
    public int getClassification() {
        return classification;
    }

    /**
     * 描述
     */
    public String getDescription() {
        return description;
    }

    SoundClassificationEnum(int classification, String description) {
        this.classification = classification;
        this.description = description;
    }

}
