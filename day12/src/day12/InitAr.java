package day12;

public class InitAr {

	public static void main(String[] args) {
		int arInt[]=new int[3];
		char arChar[]=new char[3];
		String arStr[]=new String[3];
		double arDouble[] =new double[3];
		
		for(int i=0; i<3; i++) {
			System.out.println(arInt[i]);
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println(arChar[i]);
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println(arStr[i]);
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println(arDouble[i]);
		}
		System.out.println();
	}
}
