package game.me.voice;

import game.me.voice.sound.Sound;

import java.util.List;

/**
 * 语音包
 *
 * @author zh
 */
public class Voice {

    /**
     * 语音包序号
     */
    private int no;

    /**
     * 语音包名称
     */
    private String name;

    /**
     * 语音集合
     */
    private List<Sound> soundList;


    public Voice() {
    }

    public Voice(int no, String name, List<Sound> soundList) {
        this.no = no;
        this.name = name;
        this.soundList = soundList;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public List<Sound> getSoundList() {
        return soundList;
    }

}
