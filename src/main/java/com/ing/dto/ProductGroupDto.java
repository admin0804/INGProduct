package com.ing.dto;

public class ProductGroupDto {
	
	private long productGroupId;
	
	private String productGroupName;
	
	private int productGroupCount;
	
	public ProductGroupDto() {
		
	}

	public ProductGroupDto(long productGroupId, String productGroupName, int productGroupCount) {
		this.productGroupId = productGroupId;
		this.productGroupName = productGroupName;
		this.productGroupCount = productGroupCount;
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

	public void setProductGroupName(String productGroupName) {
		this.productGroupName = productGroupName;
	}

	public int getProductGroupCount() {
		return productGroupCount;
	}

	public void setProductGroupCount(int productGroupCount) {
		this.productGroupCount = productGroupCount;
	}
	
}
