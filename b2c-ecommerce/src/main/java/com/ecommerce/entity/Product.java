package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "B2C_PRDCT")
public class Product {
	@Id
	private Integer id;
	private String name;
	private Integer quantity;
	private String size;

	@Column(name = "BRND_ID")
	private Integer brandId;

	@Column(name = "CLR_ID")
	private Integer colorId;

	@Column(name = "PRDCT_CTGR_ID")
	private Integer catagoryId;

	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "BRND_ID")
	private Brand brand;
	
	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "CLR_ID")
	private Color color;
	
	@JsonIgnoreProperties("products")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(insertable = false, updatable = false, name = "PRDCT_CTGR_ID")
	private ProductCategory productCategory;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getColorId() {
		return colorId;
	}

	public void setColorId(Integer colorId) {
		this.colorId = colorId;
	}

	public Integer getCatagoryId() {
		return catagoryId;
	}

	public void setCatagoryId(Integer catagoryId) {
		this.catagoryId = catagoryId;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}
}
