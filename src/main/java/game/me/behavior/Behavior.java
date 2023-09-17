package game.me.behavior;

/**
 * 行为
 *
 * @author zh
 */
public class Behavior {

    /**
     * 行为分类
     */
    private BehaviorClassificationEnum behaviorClassification;

    public Behavior() {
    }

    public Behavior(BehaviorClassificationEnum behaviorClassification) {
        this.behaviorClassification = behaviorClassification;
    }

    public BehaviorClassificationEnum getBehaviorClassification() {
        return behaviorClassification;
    }
}
