package game.me;

import game.me.behavior.Behavior;
import game.me.behavior.BehaviorClassificationEnum;
import game.me.dictionary.HeroDictionary;
import game.me.hero.HearoBehavior;
import game.me.hero.Hero;
import game.me.role.RoleClassificationEnum;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * flower启动器
 * 1、mode 游戏模式：1v1,5v5
 * 2、map  游戏地图：1v1,5v5
 * 3、role 角色：gain【增益】，close_combat【近战】，beat_wild【打野】
 * 4、hero 英雄：sunflower 太阳花【增益】， rose 玫瑰花【近战】，kerria 棣棠【打野】
 * 5、skin 皮肤：originalSkin 原始，snowWhiteSkin 雪白，goldenSkin 金黄
 * 6、behavior 动作：chant 吟唱，twine  缠绕，raid  突袭
 */
public class GameRunApplication {

    public static void main(String[] args) {
        run("sunflower", BehaviorClassificationEnum.WALK);
        run("sunflower", BehaviorClassificationEnum.FIGHT);
        run("sunflower", BehaviorClassificationEnum.DEVELOP);
//        run("kerria", BehaviorClassificationEnum.FIGHT);
//        run("rose", BehaviorClassificationEnum.DEVELOP);
    }

    private static void run(String cnMame, BehaviorClassificationEnum behaviorClassification) {
        Hero hero = loadHeroByEnName(cnMame);
        if (Objects.isNull(hero)) {
            System.out.println("英雄不存在");
        }
        Behavior behavior = new Behavior(behaviorClassification);
        HearoBehavior hearoBehavior = new HearoBehavior(hero, behavior);
        hearoBehavior.run();
        System.out.println("=======================");
    }

    private static Hero loadHeroByEnName(String enName) {
        return HeroDictionary.heroClassificationMap.entrySet()
                .stream()
                .flatMap((x) -> x.getValue().stream())
                .filter((x) -> x.getEnName().equals(enName))
                .findFirst().orElse(null);
    }

    private static ArrayList<Hero> loadHeroListByClass(RoleClassificationEnum roleClassification) {
        return HeroDictionary.heroClassificationMap.entrySet()
                .stream()
                .filter((x) -> x.getKey().equals(roleClassification))
                .flatMap(x -> x.getValue().stream()).collect(Collectors.toCollection(ArrayList::new));
    }


}
