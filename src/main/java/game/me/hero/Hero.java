package game.me.hero;

import game.me.role.RoleClassificationEnum;
import game.me.skill.Skill;
import game.me.skin.Skin;

import java.util.List;

/**
 * 英雄
 *
 * @author zh
 */
public class Hero {

    /**
     * 英雄序号
     */
    private int no;

    /**
     * 英雄名字
     */
    private String chName;

    /**
     * 英雄名字
     */
    private String enName;

    /**
     * 英雄角色分类
     */
    private RoleClassificationEnum roleClassification;

    /**
     * 英雄皮肤
     */
    private Skin skin;

    /**
     * 技能
     */
    private List<Skill> skillList;

    public Hero() {
    }

    public Hero(int no, String chName, String enName, RoleClassificationEnum roleClassification, Skin skin, List<Skill> skillList) {
        this.no = no;
        this.chName = chName;
        this.enName = enName;
        this.roleClassification = roleClassification;
        this.skin = skin;
        this.skillList = skillList;
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

    public RoleClassificationEnum getRoleClassification() {
        return roleClassification;
    }

    public Skin getSkin() {
        return skin;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }
}
