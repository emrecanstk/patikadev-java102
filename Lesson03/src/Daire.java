
public class Daire {
	public int r;
	public final double pi = 3.14;   // final olarak işaretlenenler değiştirilemez
	
	public Daire(int r) {
		this.r = r;
	}
	
	public void calcArea() {
		double area = pi * this.r * this.r;
		System.out.println(area);
	}
}
