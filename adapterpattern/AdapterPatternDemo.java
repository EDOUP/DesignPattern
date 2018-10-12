package adapterpattern;

/**
 * 作为两个不兼容的接口之间的桥梁
 * 讲一个类的接口转换成客户希望的另一个接口
 * 主要解决软件系统中 常常要将一些现存对象放到新环境中时，而新环境要求的接口是现对象不能满足的
 */
public class AdapterPatternDemo {
    public static void main(String[] args){
        AudioPlay audioPlayer=new AudioPlay();

        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("avi","mind me.avi");
    }
}
