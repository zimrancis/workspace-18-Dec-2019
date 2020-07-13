package behavioural.builderpattern.model;

public class Phone {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;

	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	public final String getOs() {
		return os;
	}

	public final void setOs(String os) {
		this.os = os;
	}

	public final int getRam() {
		return ram;
	}

	public final void setRam(int ram) {
		this.ram = ram;
	}

	public final String getProcessor() {
		return processor;
	}

	public final void setProcessor(String processor) {
		this.processor = processor;
	}

	public final double getScreenSize() {
		return screenSize;
	}

	public final void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public final int getBattery() {
		return battery;
	}

	public final void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}

}
