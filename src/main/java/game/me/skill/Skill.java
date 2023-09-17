package game.me.skill;

/**
 * 技能
 *
 * @author zh
 */
public class Skill {

    /**
     * 皮肤序号
     */
    private int no;

    /**
     * 皮肤名称
     */
    private String chName;

    /**
     * 皮肤名称
     */
    private String enName;

    public Skill() {
    }

    public Skill(int no, String chName, String enName) {
        this.no = no;
        this.chName = chName;
        this.enName = enName;
    }

    public int getNo() {
        return no;
    }

    public String getChName() {
        return chName;
    }

    public String getEnName() {
        return enName;
    }
}
