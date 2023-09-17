package game.me.behavior;

import java.util.HashMap;
import java.util.Map;

/**
 * 行为分类
 *
 * @author zh
 */
public enum BehaviorClassificationEnum {

    WALK(1, "走路"),
    RETURN_TRIP(2, "回程"),
    SPRING_WATER(3, "泉水"),
    FIGHT(4, "战斗"),
    DEVELOP(5, "发育"),
    GAIN(6, "增益");

    private int behavior;
    private String description;
   

    /**
     * 行为
     */
    public int getGrade() {
        return behavior;
    }

    /**
     * 描述
     */
    public String getDescription() {
        return description;
    }

    BehaviorClassificationEnum(int behavior, String description) {
        this.behavior = behavior;
        this.description = description;
    }
}
