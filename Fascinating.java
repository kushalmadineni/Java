
public class Fascinating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 219;
		if(num<100) {
			System.out.print("no");
			System.exit(0);
		}
		int n1 = num *2;
		int n2 = num *3;
		String s = num + ""+n1+""+n2;
		int flag = 1;
		for(char d='1';d<='9';d++) {
			int f=0;
			for(int i=0;i<s.length();i++) {
				char ch = s.charAt(i);
				if(d==ch) {
					f++;
				}
			}if(f!=1 && f>0) {
				flag=0;
				break;
			}
		}if(flag==1) {
			System.out.println(num + "is a fascinating");
		}
		else {
			System.out.println(num + "is not a fascinating");
		}

	}

}
