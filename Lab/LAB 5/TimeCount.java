class Time{
	int h;
	int m;
		Time(int h,int m){
			this.h=h;
			this.m=m;
	}
	public void add(Time x,Time y){
		this.h=x.h+y.h;
		this.m=x.m+y.m;
		if(this.m>60){
			this.h++;
			this.m-=60;
		}
		System.out.println(this.h+":"+this.m);
	}
}

		public class TimeCount{
			public static void main(String[]args){
				Time t1=new Time(2,30);
				Time t2 = new Time(3,60);
				Time t3 = new Time(0,0);
				t3.add(t1,t2);
			}
		}
