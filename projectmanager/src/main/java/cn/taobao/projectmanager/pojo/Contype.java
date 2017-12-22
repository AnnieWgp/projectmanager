package cn.taobao.projectmanager.pojo;

import java.io.Serializable;

public class Contype implements Serializable{

	private static final long serialVersionUID = -64164846603L;
	
	//消费类别的id
	private int tId;
	
	//消费类别名称
	private String tName;
	
	//消费类别的备注
	private String tNote;

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettNote() {
		return tNote;
	}

	public void settNote(String tNote) {
		this.tNote = tNote;
	}

	@Override
	public String toString() {
		return "Contype [tId=" + tId + ", tName=" + tName + ", tNote=" + tNote + "]";
	}

}
