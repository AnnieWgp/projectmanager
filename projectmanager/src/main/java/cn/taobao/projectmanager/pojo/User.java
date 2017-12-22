package cn.taobao.projectmanager.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User implements Serializable{

	private static final long serialVersionUID = -467887873833L;
	
	//收入流水单号
	private String inNumber;
	
	//用户的id
	private int uId;
	
	//收入金额
	private double inCost;
	
	//收入日期
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date inDate;

	//收入来源
	private String inSource;
	
	//备注
	private String inNote;

	public String getInNumber() {
		return inNumber;
	}

	public void setInNumber(String inNumber) {
		this.inNumber = inNumber;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public double getInCost() {
		return inCost;
	}

	public void setInCost(double inCost) {
		this.inCost = inCost;
	}

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

	public String getInSource() {
		return inSource;
	}

	public void setInSource(String inSource) {
		this.inSource = inSource;
	}

	public String getInNote() {
		return inNote;
	}

	public void setInNote(String inNote) {
		this.inNote = inNote;
	}

	@Override
	public String toString() {
		return "User [inNumber=" + inNumber + ", uId=" + uId + ", inCost=" + inCost + ", inDate=" + inDate
				+ ", inSource=" + inSource + ", inNote=" + inNote + "]";
	}
}
