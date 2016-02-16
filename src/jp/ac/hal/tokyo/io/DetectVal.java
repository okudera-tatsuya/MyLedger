package jp.ac.hal.tokyo.io;

/**
 * ”»’èƒNƒ‰ƒX
 * @author okudera.tatsuya
 *
 */
public class DetectVal {
	
	public String nameDetect(boolean flg) {
		String msg = "";
		if(flg == true){
			msg = Constant.ERRMSG_PRODUCTNAME_LENGTHZERO;
		}else{
			msg = "";
		}
		return msg;
	}
	

}
