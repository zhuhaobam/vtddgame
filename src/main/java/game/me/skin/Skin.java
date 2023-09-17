package game.me.skin;

import game.me.voice.Voice;

/**
 * 皮肤
 *
 * @author zh
 */
public class Skin {

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

    /**
     * 皮肤等级
     */
    private SkinGradeEnum skinGrade;

    /**
     * 皮肤语音包
     */
    private Voice voice;

    /**
     * 皮肤静态文件
     */
    private String staticFile;

    /**
     * 皮肤动态文件
     */
    private String dynamicFile;

    public Skin() {
    }

    public Skin(int no, String chName, String enName, SkinGradeEnum skinGrade, Voice voice, String staticFile, String dynamicFile) {
        this.no = no;
        this.chName = chName;
        this.enName = enName;
        this.skinGrade = skinGrade;
        this.voice = voice;
        this.staticFile = staticFile;
        this.dynamicFile = dynamicFile;
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

    public SkinGradeEnum getSkinGrade() {
        return skinGrade;
    }

    public Voice getVoice() {
        return voice;
    }

    public String getStaticFile() {
        return staticFile;
    }

    public String getDynamicFile() {
        return dynamicFile;
    }
}
