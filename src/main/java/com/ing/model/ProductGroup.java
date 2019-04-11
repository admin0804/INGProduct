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
	
	@Column(name="product_group_name")
	private String productGroupName;
	
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

	public String getProductGroupName() {
		return productGroupName;
	}

	public void setProductGroupNameEn(String productGroupName) {
		this.productGroupName = productGroupName;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
		
}


