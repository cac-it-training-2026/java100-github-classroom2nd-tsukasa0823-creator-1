/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売上の割合");
		System.out.println("売上合計      \\" + kinngakusum);

		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) (250 * ist) + "・・・ " + (int) ((250 * ist) / kinngakusum * 100) + "%");
		System.out.println(
				"ショコラ      \\" + (int) (280 * ishok) + "・・・ " + (int) ((280 * ishok) / kinngakusum * 100) + "%");
		System.out.println("ピスターシュ  \\" + (int) (320 * ip) + "・・・ " + (int) ((320 * ip) / kinngakusum * 100) + "%");

	}

}
