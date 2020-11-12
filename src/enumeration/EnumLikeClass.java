package enumeration;

public enum EnumLikeClass {

	John(11), Bella(10), Sam(13), Viraaj(9);
	private int age; // variable defined in enum EnumLikeClass

	int getage() {
		return age;
	} // method defined in enum EnumLikeClass

	private EnumLikeClass(int age)  //constructor defined in enum EnumLikeClass
	{
		this.age= age;
	}
}
