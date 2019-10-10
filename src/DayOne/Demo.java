package DayOne;

public class Demo {
	Class cass;
	Integer a = 2;
	public Class getB() {
		try {
			cass = Class.forName("/JavaDemo/src/DayOne/FinalObject.java");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cass);
		return cass;
		
	}
	public static void main(String[] args) {
		new Demo().getB();
	}
}
