package jp.ac.hal.tokyo.io;

public class CheckVal {
	
	//�����̓`�F�b�N
	public static boolean lengthEmptiy(String data) {
		if(data == null || data.isEmpty() || data.length() == 0){
			return true;
		}else{
			return false;
		}
	}
	
	
	// �T�j�^�C�Y
	public static String Sanitize(String data) {
		data = data.replace("&", "&amp;");
		data = data.replace("\"", "&quot;");
		data = data.replace("<", "&lt;");
		data = data.replace(">", "&gt;");
		data = data.replace("'", "&#39;");

		return data;
	}
	
	//���i���̒���
	//�R�����g�̒���

}
