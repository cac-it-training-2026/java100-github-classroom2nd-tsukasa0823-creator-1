/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String st = reader.readLine();
		int ist = Integer.parseInt(st);
		System.out.print("ショコラ      >");
		String shok = reader.readLine();
		int ishok = Integer.parseInt(shok);
		System.out.print("ピスターシュ  >");
		String p = reader.readLine();
		int ip = Integer.parseInt(p);
		//	シトロン      \250 ・・・ 残り30個
		//	 * ショコラ      \280 ・・・ 残り30個
		//	 * ピスターシュ  \320 ・・・ 残り30個
		//	
		int sum = ist + ishok + ip;
		int kinngakusum = ist * 250 + ishok * 280 + ip * 320;

		System.out.println("シトロン    " + st + " 個");
		System.out.println("ショコラ    " + shok + " 個");
		System.out.println("ピスターシュ " + p + " 個");
		System.out.println("合計個数" + sum + "個");
		System.out.println("合計金額" + kinngakusum + "円");

		System.out.println("をお買いあげですね。");
		System.out.println("承りました。");

	}

}
