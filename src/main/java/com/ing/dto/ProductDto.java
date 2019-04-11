package com.ing.dto;

import java.io.Serializable;

public class ProductDto implements Serializable{

	private long productId;
	
	private long productGroupId;
	
	private String productName;
	
	private String percentage;

	private String interestRate;

	private String special;

	private String depositAndWithdrawal;

	private String minInvestment;

	private String maxInvestment;

	private String duration;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getProductGroupId() {
		return productGroupId;
	}

	public void setProductGroupId(long productGroupId) {
		this.productGroupId = productGroupId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPercentage() {
		return percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getDepositAndWithdrawal() {
		return depositAndWithdrawal;
	}

	public void setDepositAndWithdrawal(String depositAndWithdrawal) {
		this.depositAndWithdrawal = depositAndWithdrawal;
	}

	public String getMinInvestment() {
		return minInvestment;
	}

	public void setMinInvestment(String minInvestment) {
		this.minInvestment = minInvestment;
	}

	public String getMaxInvestment() {
		return maxInvestment;
	}

	public void setMaxInvestment(String maxInvestment) {
		this.maxInvestment = maxInvestment;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
}
