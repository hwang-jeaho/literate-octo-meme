package p362;

import p349.RemoteControl;
import p351.Television;
import p361.Audio;

public class RemotecontrolExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
