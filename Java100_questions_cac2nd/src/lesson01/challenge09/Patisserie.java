/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("\n明日の三色マカロンの配合率が決まりました！");
		System.out.println("\nシトロンの味    ・・・ " + (int) ((250 * ist) / kinngakusum * 100) + "%");
		System.out.println("ショコラの味    ・・・ " + (int) ((280 * ishok) / kinngakusum * 100) + "%");
		System.out.println("ピスターシュの味・・・ " + (int) ((320 * ip) / kinngakusum * 100) + "%");

		System.out.println("\nが楽しめます！");
		System.out.println("\n値段は\\" + ((kinngakusum / (int) sum) / 10 * 10) + "です。");

	}

}
