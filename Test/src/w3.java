import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class w3 {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������@�~�ͤ@�������A�C�������@�~�ͤ@�����q�������M�@�Ӥ�����N�����A
		//���q�������@�~�ͤ@�������ᦺ���C�{�b�b�@�ӥu���@�������������������ҤU�A
		//Input N�~�AOutput �������X���B�`�@���X���e��
		calBee(2);

	}
	private static void calBee(int n) {
		// TODO Auto-generated method stub
		int totalMale=0;
		int totalFemale=0;
		for(int i = 0; i < n;i++) {
			int male = fib(n-i);
			int female = fib(n-1-i);
			totalMale += male;
			totalFemale += female;
		}
		System.out.println("������" + totalMale +"��");
		System.out.println("�e���`�@��" + (totalMale+totalFemale+1) +"��");
	}

	private static int fib(int i) {
		// TODO Auto-generated method stub
		if(i == 0 || i ==1) {
			return i;
		}else {
			return fib(i-2)+fib(i-1);
		}
	}
	

}
