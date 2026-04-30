/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int kst = 30;
		int ksyok = 30;
		int kp = 30;

		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン      \\250 ・・・ 残り" + kst + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + ksyok + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + kp + "個");
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
		System.out.println("シトロン    " + st + " 個");
		System.out.println("ショコラ    " + shok + " 個");
		System.out.println("ピスターシュ " + p + " 個");
		System.out.println("をお買いあげですね。");
		System.out.println("承りました。");

	}

}
