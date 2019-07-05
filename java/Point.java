package txt_6chap_41;

public class Point {
    public double x;
    public double y;
    public Point(double x,double y)
    {
    	this.x=x;
    	this.y=y;
    }
	public double distance(Point p)
	{
		double m=Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
		return m;
	}
	public double distance(int x,int y)
	{
		double m=Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
		return m;
	}
	
	public static double distance(Point x,Point y)
	{
		double m=Math.sqrt((x.x-y.x)*(x.x-y.x)+(x.y-y.y)*(x.y-y.y));
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(1,2);
		Point p2=new Point(3,4);
		System.out.println("点到p2点间的距离为：  "+p1.distance(p2));
		System.out.println("点到(3,4)点间的距离为：  "+p1.distance(3, 4));
		System.out.println("p1点到p2点间的距离为：  "+distance(p1, p2));
	}

}
