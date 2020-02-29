

/** 
*The purpose of this class is to model a television
*Vi Tuan Duc Nguyen and 2/25
*/
public class Television {

	//declaring
	final String MANUFACTURER; //brand name
	final int SCREEN_SIZE; //the size of the television screen
	boolean powerOn; //true if the power is on, and false if the power is off
	int channel; //the station that the television is showing
	int volume; //value representing the loudness (0 being no sound).
	
	/**constructor*/
	public Television(String brand, int size) {
		MANUFACTURER = brand; 
		SCREEN_SIZE = size; 
		powerOn = false; 
		channel =2; 
		volume = 20;
	}
	
	/**
	 * The setChannel method will store the desired 
	 * station in the channel field.
	 * */
	void setChannel(int c) {
		channel = c;
	}
	
	/**The power method will toggle the power between on and off, changing the 
	 * value stored in the powerOn field from true to false or from false to true
	 */
	void power() {
		powerOn = !powerOn;
	}
	/**The increaseVolume method will increase the value stored in
	 * the volume field by 1.
	 */
	void increaseVolume() {
		volume+=1;
	}
	
	/**The decreaseVolume method will decrease the value stored in
	 * the volume field by 1.
	 */
	void decreaseVolume() {
		volume-=1;
	}
	
	/** The getChannel method will return the value stored in the channel field.*/
	int getChannel() {
		return channel;
	}

	/**The getVolume method will return the value stored in the volume field*/
	int getVolume() {
		return volume;
	}
	
	/**The getManufacturer method will return the constant value
	stored in the MANUFACTURER field.*/
	String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**The getScreenSize method will return the constant value stored in the 
	 * SCREEN_SIZE field.
	 */	
	int getScreenSize() {
		return SCREEN_SIZE;
	}
	
}
