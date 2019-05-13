package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (j < i) {
					System.out.print("■");
				} else {
					System.out.print("□");
				}
			}
			System.out.println("□");
		}

				for (int i = 5; i > 0; i--) {
					//for (int j = 0; j < i-1; j++) {
					for (int j = 0; j < 4; j++) {
						if(j >= i) {
						System.out.print("□");
						}
						else {
						System.out.print("■");
						}
					}
					if (i == 5) {
						System.out.println("■");
					} else {
						System.out.println("□");
					}

				}

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

	}
}
