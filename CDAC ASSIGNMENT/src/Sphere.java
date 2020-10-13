import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the radius of sphere");
		double radius=scan.nextDouble();
		volume vol=new volume(radius);
		surface sur=new surface(radius);
		
		System.out.println(sur.sur());
		System.out.println(vol.vol());
		scan.close();

	}

}
