import java.io.*;

public class angleBetweenTwoHands{
	public static int calculateAngle(double h,double m){
		if (h<0 || m<0 ||m>60 ||h>12) {
			System.out.println("Wrong Input");
		}
		if (h==12) {
			h=0;
		}
		if (m==60) {
				m=0;
				h = h + 1;
		}
		if (h>12) {
			h = h - 12;
		}
		int h_angle = (int)(0.5*(h*60+m));
		int m_angle = (int)(6*m);

		int angle = Math.abs(h_angle - m_angle);

		angle = Math.min(360-angle,angle);

		return angle;
	}
	public static void main(String[] args) {
		System.out.println(calculateAngle(9,30)+" degree");
	}
}