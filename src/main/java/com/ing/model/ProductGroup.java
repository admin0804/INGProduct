package com.ing.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product_group")
public class ProductGroup {
	
	

	
	@Id
	@Column(name="product_group_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productGroupId;
	
	@Column(name="product_group_name_en")
	private String productGroupNameEn;
	
	@Column(name="product_group_name_du")
	private String productGroupNameDu;
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="product_group_id")
	private List<Product> product;
	
	public ProductGroup() {
		super();
	}

	public long getProductGroupId() {
		return productGroupId;
	}

	public void setProductGroupId(long productGroupId) {
		this.productGroupId = productGroupId;
	}

	public String getProductGroupNameEn() {
		return productGroupNameEn;
	}

	public void setProductGroupNameEn(String productGroupNameEn) {
		this.productGroupNameEn = productGroupNameEn;
	}

	public String getProductGroupNameDu() {
		return productGroupNameDu;
	}

	public void setProductGroupNameDu(String productGroupNameDu) {
		this.productGroupNameDu = productGroupNameDu;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
		
}


