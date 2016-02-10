package jp.ac.hal.tokyo.io;

public class CheckVal {
	
	//未入力チェック
	public static boolean lengthEmptiy(String data) {
		if(data == null || data.isEmpty() || data.length() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	
	// サニタイズ
	public static String Sanitize(String data) {
		data = data.replace("&", "&amp;");
		data = data.replace("\"", "&quot;");
		data = data.replace("<", "&lt;");
		data = data.replace(">", "&gt;");
		data = data.replace("'", "&#39;");

		return data;
	}
	
	//商品名の長さ
	//コメントの長さ

}
