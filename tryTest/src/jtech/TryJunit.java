package jtech;

public class TryJunit {
	
	public static final String STATIC_INIT = "staticイニシャライザ";
	public static int cnt = 0;
	
	static {
		System.out.println(STATIC_INIT + "が呼ばれました");
		cnt++;
		System.out.println(STATIC_INIT + "カウント=" + cnt);
	}
	
	TryJunit() {
		System.out.println("コンストラクタが呼ばれました");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("メインメソッドです");
	}

}
