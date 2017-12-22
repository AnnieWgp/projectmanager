package cn.taobao.projectmanager.pojo;

import java.io.Serializable;

public class Consumption implements Serializable {

	private static final long serialVersionUID = -6413549847613L;

	// 消费名称id
	private int cId;

	// 消费名称
	private String cName;

	// 消费类别id
	private int tId;

	// 消费名称备注
	private String cNote;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getcNote() {
		return cNote;
	}

	public void setcNote(String cNote) {
		this.cNote = cNote;
	}

	@Override
	public String toString() {
		return "Consumption [cId=" + cId + ", cName=" + cName + ", tId=" + tId + ", cNote=" + cNote + "]";
	}
}
