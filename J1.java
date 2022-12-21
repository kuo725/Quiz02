package te;

import java.util.*;

public class test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1, s2, count;
		System.out.println("密碼輸入測試");
		System.out.print("請輸入密碼:");
		s1 = sc.nextInt();

		count = 0;

		for (;;) {
			System.out.print("請再輸入一次密碼:");
			s2 = sc.nextInt();
			if (s1 == s2) {
				System.out.println("密碼正確");
				break;
			} else
				count += 1;
			if (count == 3) {
				System.out.println("與第一次輸入的不同!");
				throw new RuntimeException("輸入三次錯誤！程式停止！");
			} else
				System.out.println("與第一次輸入的不同!");
		}

	}
}
