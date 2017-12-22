package cn.taobao.projectmanager.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Account implements Serializable {

	private static final long serialVersionUID = -5846970261372764303L;

	// 账单流水号
	private String consumeNumber;

	// 消费名称的id
	private int cId;

	// 消费金额
	private double consumeCost;

	//消费方式
	private String consumeWay;
	
	// 消费日期
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date consumeTime;

	// 消费类别的id
	private int tId;
	
	//消费用户
	private String consumeUser;
	
	//消费备注
	private String consumeNote;

	//标志位
	private String consumeFlag;

	public String getConsumeNumber() {
		return consumeNumber;
	}

	public void setConsumeNumber(String consumeNumber) {
		this.consumeNumber = consumeNumber;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public double getConsumeCost() {
		return consumeCost;
	}

	public void setConsumeCost(double consumeCost) {
		this.consumeCost = consumeCost;
	}

	public String getConsumeWay() {
		return consumeWay;
	}

	public void setConsumeWay(String consumeWay) {
		this.consumeWay = consumeWay;
	}

	public Date getConsumeTime() {
		return consumeTime;
	}

	public void setConsumeTime(Date consumeTime) {
		this.consumeTime = consumeTime;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getConsumeUser() {
		return consumeUser;
	}

	public void setConsumeUser(String consumeUser) {
		this.consumeUser = consumeUser;
	}

	public String getConsumeNote() {
		return consumeNote;
	}

	public void setConsumeNote(String consumeNote) {
		this.consumeNote = consumeNote;
	}

	public String getConsumeFlag() {
		return consumeFlag;
	}

	public void setConsumeFlag(String consumeFlag) {
		this.consumeFlag = consumeFlag;
	}

	@Override
	public String toString() {
		return "Account [consumeNumber=" + consumeNumber + ", cId=" + cId + ", consumeCost=" + consumeCost
				+ ", consumeWay=" + consumeWay + ", consumeTime=" + consumeTime + ", tId=" + tId + ", consumeUser="
				+ consumeUser + ", consumeNote=" + consumeNote + ", consumeFlag=" + consumeFlag + "]";
	}
	
	
}
