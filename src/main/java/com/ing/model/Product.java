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

	public Product(long productId, long productGroupId, String productNameEn, String productNameDu) {
		super();
		this.productId = productId;
		this.productGroupId = productGroupId;
		this.productNameEn = productNameEn;
		this.productNameDu = productNameDu;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productGroupId=" + productGroupId + ", productNameEn="
				+ productNameEn + ", productNameDu=" + productNameDu + "]";
	}
	
	

}
