package com.ing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	
	@Column(name="product_group_id")
	private long productGroupId;
	
	@Column(name="product_name_en")
	private String productNameEn;
	
	@Column(name="product_name_du")
	private String productNameDu;
	
	@Column(name="percentage")
	private String percentage;

	@Column(name="interest_rate")
	private String interestRate;

	@Column(name="special")
	private String special;

	@Column(name="deposit_and_withdrawal")
	private String depositAndWithdrawal;

	@Column(name="min_investment")
	private String minInvestment;

	@Column(name="max_investment")
	private String maxInvestment;

	@Column(name="duration")
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

	public String getProductNameEn() {
		return productNameEn;
	}

	public void setProductNameEn(String productNameEn) {
		this.productNameEn = productNameEn;
	}

	public String getProductNameDu() {
		return productNameDu;
	}

	public void setProductNameDu(String productNameDu) {
		this.productNameDu = productNameDu;
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
