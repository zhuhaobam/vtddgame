package game.me.hero;


import game.me.behavior.Behavior;
import game.me.skill.Skill;
import game.me.skin.Skin;
import game.me.voice.Voice;
import game.me.voice.sound.Sound;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * 英雄的行为
 */
public class HearoBehavior {

    /**
     * 英雄
     */
    private Hero hero;

    /**
     * 行为
     */
    private Behavior behavior;


    public HearoBehavior() {
    }

    public HearoBehavior(Hero hero, Behavior behavior) {
        this.hero = hero;
        this.behavior = behavior;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void run() {
        Hero hero = this.hero;
        System.out.println("英雄：".concat(hero.getChName()).concat("  ").concat(hero.getEnName()));
        Behavior behavior = this.behavior;
        System.out.println("行为：".concat(behavior.getBehaviorClassification().getDescription()));
        System.out.println("分类：".concat(hero.getRoleClassification().getDescription()).concat("英雄"));
        Skin skin = hero.getSkin();
        System.out.println("皮肤：".concat(skin.getChName()).concat("  ").concat(skin.getEnName()).concat("  ").concat("(" + skin.getSkinGrade().getDescription() + ")"));
        List<Skill> skillList = hero.getSkillList();
        System.out.println("技能：".concat(skillList.stream().map(x -> x.getChName().concat("  ").concat(x.getEnName())).collect(Collectors.joining(";   "))));
        Voice voice = skin.getVoice();
        if (Objects.isNull(voice)) {
            System.out.println("没有语音包");
        } else {
            System.out.println("语音包：".concat(voice.getName()));
            List<Sound> soundList = voice.getSoundList();
            ArrayList<Sound> behaviorSoundList = soundList.stream()
                    .filter(x -> x.getBehaviorClassifications().contains(behavior.getBehaviorClassification()))
                    .collect(Collectors.toCollection(ArrayList::new));
            if (behaviorSoundList.isEmpty()) {
                System.out.println("没有语音");
            } else {
                System.out.println(skin.getChName().concat("语音集：").concat(behaviorSoundList.stream()
                        .map(x -> x.getName().concat("(" + x.getSoundClassification().getDescription() + ")"))
                        .collect(Collectors.joining(";"))));
                int listSize = behaviorSoundList.size();
                int randomElementIndex = ThreadLocalRandom.current().nextInt(listSize) % listSize;
                Sound sound = behaviorSoundList.get(randomElementIndex);
                System.out.println("随机播报语音".concat(randomElementIndex + "").concat("：").concat(sound.getName()));
            }
        }
    }
}
