package DayOne;

public final class FinalObject {
	int a = 1;
	public static FinalObject addString(FinalObject a) {
		a.a = 110;
		return a;
		
	}

	public static void main(String[] args) {
		FinalObject a = new FinalObject();
		FinalObject b = addString(a);
		System.out.println(a.a);
	}
}
