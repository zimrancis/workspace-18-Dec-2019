package common;
class Alien {

	int aid;
	String aname;

	public Alien() {
		System.out.println("OneTime Execution");
	}

	public Alien(int aid, String aname) {
		this.aid=aid;
		this.aname=aname;
	}

	public int getAlienId() {
		return aid;
	}
	public void setAlienId(int aid) {
		this.aid=aid;
	}

	public String getAlienName() {
		return aname;
	}
	public void setAlienId(String aname) {
		this.aname=aname;
	}

	public String toString() {
		return "[aid:"+aid+"\naname: "+aname+"]";
	}

	public void show() {
		System.out.println("In show");
	}
}

class ConstrutorTest {
	public static void main(String...args) {

		Alien a = new Alien();
		a.show();
		Alien a2 = new Alien();
		a2.show();

	}
}

