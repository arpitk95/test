
public class volume {
	double radius;
	public volume(double radius) {
		this.radius=radius;
	}
	
	public double vol() {
		return 4*Math.PI*radius*radius*radius/3;
		
	}

}
