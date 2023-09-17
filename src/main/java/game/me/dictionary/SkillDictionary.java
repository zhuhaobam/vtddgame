package game.me.dictionary;

import game.me.skill.Skill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 技能
 *
 * @author zh
 */
public class SkillDictionary {


    public final static Map<String, List<Skill>> skillMap = new HashMap<>();

    static {
        Skill skill01 = new Skill(1, "吟唱", "chant");
        Skill skill011 = new Skill(11, "甘霖", "timely rainfall");
        Skill skill02 = new Skill(2, "缠绕", "twine");
        Skill skill022 = new Skill(22, "爆发尖刺", "burst spike");
        Skill skill03 = new Skill(3, "突袭", "raid");
        Skill skill033 = new Skill(33, "花海", "flower sea");
        List<Skill> skillList1 = new ArrayList<>();
        skillList1.add(skill01);
        skillList1.add(skill011);
        skillMap.put("sl01", skillList1);

        List<Skill> skillList2 = new ArrayList<>();
        skillList2.add(skill02);
        skillList2.add(skill022);
        skillMap.put("sl02", skillList2);

        List<Skill> skillList3 = new ArrayList<>();
        skillList3.add(skill03);
        skillList3.add(skill033);
        skillMap.put("sl03", skillList3);

    }
}
