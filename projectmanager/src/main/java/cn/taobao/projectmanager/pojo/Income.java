package cn.taobao.projectmanager.pojo;

import java.io.Serializable;

public class Income implements Serializable{

	private static final long serialVersionUID = -467887873833L;
	
	//用户的id
	private int uId;
	
	//用户名
	private String uName;
	
	//密码
	private String uPassword;
	
	//中文名
	private String uChinesename;

	//手机
	private String uTel;
	
	//头像
	private String uImg;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuChinesename() {
		return uChinesename;
	}

	public void setuChinesename(String uChinesename) {
		this.uChinesename = uChinesename;
	}

	public String getuTel() {
		return uTel;
	}

	public void setuTel(String uTel) {
		this.uTel = uTel;
	}

	public String getuImg() {
		return uImg;
	}

	public void setuImg(String uImg) {
		this.uImg = uImg;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPassword=" + uPassword + ", uChinesename=" + uChinesename
				+ ", uTel=" + uTel + ", uImg=" + uImg + "]";
	}

}
