/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String st = reader.readLine();
		double ist = Double.parseDouble(st);
		System.out.print("ショコラ      >");
		String shok = reader.readLine();
		double ishok = Double.parseDouble(shok);
		System.out.print("ピスターシュ  >");
		String p = reader.readLine();
		double ip = Double.parseDouble(p);
		//			シトロン      \250 ・・・ 残り30個
		//			 * ショコラ      \280 ・・・ 残り30個
		//			 * ピスターシュ  \320 ・・・ 残り30個

		double sum = ist + ishok + ip;
		int kinngakusum = (int) (ist * 250 + ishok * 280 + ip * 320);

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

		int nst = (int) (kst - ist);
		int nsyok = (int) (ksyok - ishok);
		int np = (int) (kp - ip);

		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン      \\250 ・・・ 残り" + nst + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + nsyok + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + np + "個");
	}

}
