package com.example.SplitApp.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Members {
	@Id
	private int memberId;
	private String memberName;
	private double amountOwed;
	private double amountLent;
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", nullable = false)
	private Groups group;
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public double getAmountOwed() {
		return amountOwed;
	}
	public void setAmountOwed(double amountOwed) {
		this.amountOwed = amountOwed;
	}
	public double getAmountLent() {
		return amountLent;
	}
	public void setAmountLent(double amountLent) {
		this.amountLent = amountLent;
	}
	public Groups getGroup() {
		return group;
	}
	public void setGroup(Groups group) {
		this.group = group;
	}
	

}
