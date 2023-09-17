package game.me.role;

/**
 * 角色分类
 * @author zh
 */
public enum RoleClassificationEnum {

    GAIN(1, "增益"),
    CLOSE_COMBAT(2, "近战"),
    BEAT_WILD(3, "打野");


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

    RoleClassificationEnum(int classification, String description) {
        this.classification = classification;
        this.description = description;
    }


}
