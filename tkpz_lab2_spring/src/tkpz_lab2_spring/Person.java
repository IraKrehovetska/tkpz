package tkpz_lab2_spring;

public class Person {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void getPersonAge() {
		int age = getAge();
		if (age >= 0 && age <= 13) {
			System.out.println("The person is child.");
		} else {
			if (age > 13 && age <= 21) {
				System.out.println("The person is teenager.");
			} else {
				if (age > 21 && age <= 65) {
					System.out.println("The person is adult.");
				} else {
					if (age > 65) {
						System.out.println("The person is old.");
					} else {
						System.out.println("Wrong age.");
					}
				}
			}
		}
	}
}
