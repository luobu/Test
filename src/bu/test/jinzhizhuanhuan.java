package bu.test;

public class jinzhizhuanhuan {
	public static void main(String[] args){
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483648
		System.out.println("10�Ķ�����="+Integer.toBinaryString(10));
		System.out.println("10�İ˽���="+Integer.toOctalString(10));
		System.out.println("10��ʮ������="+Integer.toHexString(10));
		System.out.println(Integer.valueOf(0x80000000));//-2147483648
		System.out.println(Integer.valueOf(0x7FFFFFFF));//2147483647
	}
}

