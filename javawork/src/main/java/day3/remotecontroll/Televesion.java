package day3.remotecontroll;

public class Televesion implements RemoteControl{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("티비를 켠다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끈다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}else if(volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재볼륨은 " + volume);
	}
		
	
}
