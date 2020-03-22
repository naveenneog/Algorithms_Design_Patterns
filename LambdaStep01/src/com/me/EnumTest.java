package com.me;

public enum EnumTest {
	BREAKFAST(7, 30), LUNCH(12, 15), DINNER(19, 45);
	private int hh;
	private int mm;

	EnumTest(int hh, int mm) {
		assert (hh >= 0 && hh <= 23) : "Illegal hour.";
		assert (mm >= 0 && mm <= 59) : "Illegal mins.";
		this.hh = hh;
		this.mm = mm;
	}

	public int getHour() {
		return hh;
	}

	public int getMins() {
		return mm;
	}

	public static void main(String args[]){
		EnumTest t =  BREAKFAST;
		System.out.println(t.getHour() +":"+t.getMins());
		}
}

class A {
	{
		System.out.println("block");
	}
	static {
		System.out.println("static");
	}
	

	public A(){System.out.println("A");}

public static void main(String[] args){
	int i = 010;
	int j = 07;
	
	System.out.println(b);
	A a = new A();
}
}