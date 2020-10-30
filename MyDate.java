public class MyDate
{
	private int day,month,year;
	MyDate()
	{
		day=20;month=10;year=2020;
	}
	MyDate(int d,int m,int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
	}
	int getDay(){return day;}
	void setDay(int d){ day=d; }
	int getMonth(){return month;}
	void setMonth(int m){ month=m; }
	int getYear(){return year;}
	void setYear(int y){ year=y; }
	void display(){System.out.println(day+"/"+month+"/"+year);}
	static void show(){System.out.println("in static method");}
	public static void main(String args[]) {
		System.out.println("Print Using default");
		MyDate d = new MyDate();
		d.display();
		MyDate.show();
		System.out.println("Print Using Parameters");
		MyDate f = new MyDate(10,12,1997);
		System.out.println(f.day);
		f.display();
		System.out.println("Print Using Getter Setter");
		MyDate g = new MyDate();
		g.setDay(11);
		g.setDay(7);
		g.setDay(1998);
		g.display();
	}
}
