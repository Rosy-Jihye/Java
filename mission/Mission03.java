package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		//������ �������� ���ؼ� ��ü �ڸ��� �� ¦��, Ȧ���� ������ ������.
		//5�ڸ��� ex)12345
		//¦���� ����:2��
		//Ȧ���� ����:3��
		
		Scanner sc=new Scanner(System.in);
		System.out.println("5�ڸ� �Է�:");
		
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		
		even+=(num/10000%2==0)?1:0;
		even+=(num/1000%10%2==0)?1:0;
		even+=(num/100%100%2==0)?1:0;
		even+=(num/10%20%2==0)?1:0;
		even+=(num%2==0)?1:0;
		
		odd=5-even;
		
		if (even >odd)
			System.out.println("¦���� Ů�ϴ�");
		else
			System.out.println("Ȧ���� Ů�ϴ�");
		
		
		
	}

}
