package te;

interface IArea { // IArea介面宣告
	// 介面方法: 計算面積
	void area();
}

class Circle implements IArea { // Circle類別宣告
	private double r; // 半徑
	// 建構子

	public Circle(double r) {
		this.r = r;
	}

	// 成員方法: 實作介面方法area()
	public void area() {
		System.out.println("圓形面積: " + 3.1416 * r * r);
	}
}

class Rectangle implements IArea { // Rectangle類別宣告
	private double w; // 寬
	private double h; // 高
	// 建構子

	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	public void area() {
		System.out.println("長方形面積: " + (w * h));
	}
}

class Triangle implements IArea { // Triangle類別宣告
	private double h; // 高
	private double b; // 三角形底長

	public Triangle(double h, double b) {
		this.h = h;
		this.b = b;
	}

	// 成員方法: 實作介面方法area()
	public void area() {
		System.out.println("三角形面積: " + h * b / 2.0);
	}
}

public class test02 {// 主程式
	public static void main(String[] args) {
		IArea a;
		// 介面的物件變數
		// 宣告類別型態的變數, 並且建立物件
		Circle c = new Circle(6.0);
		Rectangle r = new Rectangle(10.0, 15.0);
		Triangle t = new Triangle(20.0, 15.0);
		// 呼叫介面的介面方法area(), 以下為多形程式........
		for (int i = 1; i <= 3; i++) {
			if (i == 1)
				a = c; // 圓形else
			else if (i == 2)
				a = r; // 長方形
			else
				a = t; // 三角形
			a.area();
		}
	}

}
