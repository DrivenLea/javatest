package 面向对象;

public class TestTV {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
    TV tv1 =new TV();
    tv1.turnOn();
    tv1.setChannel(30);
    tv1.setVolume(3);
    
    TV tv2 =new TV();
    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp();
    
    System.out.println("tv1's channel is " + tv1.channel
    		+ " and volume level is " + tv1.volumelevel);
    System.out.println("tv2's channel is " + tv2.channel
    		+ " and volume level is " + tv2.volumelevel);
	}

}
