package com.ing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_group")
public class ProductGroup {
	
	@Id
	@Column(name="product_group_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productGroupId;
	
	@Column(name="product_name_en")
	private String productNameEn;
	
	@Column(name="product_name_du")
	private String productNameDu;
	public ProductGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductGroup(long productId, String productNameEn,
			String productNameDu) {
		super();
		this.productGroupId = productId;
		this.productNameEn = productNameEn;
		this.productNameDu = productNameDu;
	}
	@Override
	public String toString() {
		return "ProductGroup [productId=" + productGroupId + ", productNameEn="
				+ productNameEn + ", productNameDu=" + productNameDu + "]";
	}
	public long getProductId() {
		return productGroupId;
	}
	public void setProductId(long productId) {
		this.productGroupId = productId;
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

	
	
}


