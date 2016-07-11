package bu.test;

public class hello {
	public static void main(String[] args) {
		int i=0;
		int sum=0;
		for(;i<10;i++){
			sum+=i;
			if(i==5){
				return;
			}
		}
		System.out.println(sum);
	}

}
