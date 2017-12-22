package cn.taobao.projectmanager.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

	public static String getWaterNumber(){
		SimpleDateFormat df = new SimpleDateFormat("yyMMddHHmmss");
		return df.format(new Date());
	}
}


