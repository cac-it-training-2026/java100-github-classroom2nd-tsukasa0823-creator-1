/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		//			シトロン      \250 ・・・ 残り30個
		//			 * ショコラ      \280 ・・・ 残り30個
		//			 * ピスターシュ  \320 ・・・ 残り30個

		int sum = ist + ishok + ip;
		int kinngakusum = ist * 250 + ishok * 280 + ip * 320;

		System.out.println("シトロン    " + st + " 個");
		System.out.println("ショコラ    " + shok + " 個");
		System.out.println("ピスターシュ " + p + " 個");
		System.out.println("合計個数" + sum + "個");
		System.out.println("合計金額" + kinngakusum + "円");

		System.out.println("をお買いあげですね。");
		System.out.println("承りました。");

		int kst = 30;
		int ksyok = 30;
		int kp = 30;

		int nst = kst - ist;
		int nsyok = (ksyok - ishok);
		int np = kp - ip;

		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン      \\250 ・・・ 残り" + nst + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + nsyok + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + np + "個");
	}

}
