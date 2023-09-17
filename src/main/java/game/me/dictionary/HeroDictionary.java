package game.me.dictionary;

import game.me.hero.Hero;
import game.me.role.RoleClassificationEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 英雄
 *
 * @author zh
 */
public class HeroDictionary {


    public final static Map<Enum, List<Hero>> heroClassificationMap = new HashMap<>();

    static {
        int sunflowerSkinIndex = 1;
        int roseSkinIndex = 0;
        int kerriaSkinIndex = 0;

        List<Hero> gainHeroList = new ArrayList<>();
        gainHeroList.add(new Hero(1, "太阳花", "sunflower",
                RoleClassificationEnum.GAIN,
                SkinDictionary.skinMap.get("sunflower").get(sunflowerSkinIndex),
                SkillDictionary.skillMap.get("sl01")));

        heroClassificationMap.put(RoleClassificationEnum.GAIN, gainHeroList);


        gainHeroList.add(new Hero(2, "玫瑰花", "rose",
                RoleClassificationEnum.CLOSE_COMBAT,
                SkinDictionary.skinMap.get("rose").get(roseSkinIndex),
                SkillDictionary.skillMap.get("sl02")));

        heroClassificationMap.put(RoleClassificationEnum.CLOSE_COMBAT, gainHeroList);

        gainHeroList.add(new Hero(3, "棣棠", "kerria",
                RoleClassificationEnum.BEAT_WILD,
                SkinDictionary.skinMap.get("kerria").get(kerriaSkinIndex),
                SkillDictionary.skillMap.get("sl03")));

        heroClassificationMap.put(RoleClassificationEnum.BEAT_WILD, gainHeroList);


    }
}
