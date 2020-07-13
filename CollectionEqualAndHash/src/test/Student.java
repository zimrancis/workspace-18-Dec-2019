package test;

public class Student {

	private String registratoinNumber;

	public Student(String string) {
		this.registratoinNumber = string;
	}

	public String getRegistartionNumber() {
		return registratoinNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registratoinNumber = registrationNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof Student) {
			String regNumber = ((Student) o).getRegistartionNumber();
			if (regNumber != null && regNumber.equals(this.getRegistartionNumber())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// return 5;
		return this.registratoinNumber.hashCode();

	}

}
