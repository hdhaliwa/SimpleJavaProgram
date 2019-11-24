package co.edureka.demo.java.basics;

public class Outer {

void show(){
	System.out.println("outer show");
	
}
	class inner{
		void show(){
			System.out.println("show of inner class");
		}
	}
	public static void main(String[] args) {
		Outer Oref = new Outer();
		Oref.show();
		Outer.inner iref = Oref.new inner(); //Object within an Object  or Containment
		iref.show();
	}

}
