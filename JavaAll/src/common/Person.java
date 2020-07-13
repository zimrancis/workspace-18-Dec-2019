package common;


enum Gender {
 MALE, FEMALE, UNKNOWN
};


class Person {

	private String name;
	private Gender gender;
	private double age;


public Person(String name, Gender gender, double age) {
 this.name = name;
 this.gender = gender;
 this.age = age;
 }

 public void setName(String name) {
 this.name = name;
 }

 public String getName() {
 return name;
 }

 public void setGender(Gender gender) {
 this.gender = gender;
 }

 public Gender getGender() {
 return gender;
 }

 public void setAge(double age) {
  this.age = age;
  }

  public double getAge() {
	  //System.out.println("getAge for " + name);
  return age;
  }
}

