package H_exe5;
import java.lang.Math;
public class ½üËÆÖµ {
	public static int fac(int n){
		int res=1,x=1;
		for(;x<=n;x++) {
			res = res*x;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v=1;
		double x=0.2;
		int flag = 1;
		while(x<=1) {
		while(flag<=6) {
			v += Math.pow(x, flag)/fac(flag);
			flag++;
		}
		flag=1;
		System.out.printf("%.6f\n",v);
		v=1;
		x+=0.2;
	}
		}
}
