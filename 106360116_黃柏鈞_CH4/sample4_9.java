package chapter4;

public class sample4_9 {
	public static void main(String[] arg) {
		Car[] cars;
		cars = new Car[2];
		
		cars[0]=new Car();
		cars[1]=new RacingCar();
		
		for(int i=0;i<cars.length;i++) {
			Class cl = cars[i].getClass();
			System.out.println("��"+(i+1)+"�Ӫ������O�O"+cl);
		}
	}
}
/*
class Car
{
	protected int num;
	protected double gas;
	
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}

class RacingCar extends Car{
	private int course;
	
	public RacingCar() {
		course = 0 ;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public void setCourse(int c) {
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	
	public void show() {
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);
	}
}
*/