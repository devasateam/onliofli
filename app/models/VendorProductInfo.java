package models;

import models.utils.Pricing;

/**
 * @Author Pramod Email:sendpramod@gmail.com
 */
public class VendorProductInfo {
	
	private Vendor vendor;
	private Pricing pricing;
	private int stock;
	private VendorShippingInfo vendorShippingInfo;
	private boolean isEnabled;
	private boolean isDead;
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public Pricing getPricing() {
		return pricing;
	}
	public void setPricing(Pricing pricing) {
		this.pricing = pricing;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public VendorShippingInfo getVendorShippingInfo() {
		return vendorShippingInfo;
	}
	public void setVendorShippingInfo(VendorShippingInfo vendorShippingInfo) {
		this.vendorShippingInfo = vendorShippingInfo;
	}
	public boolean isEnabled() {
		return isEnabled;
	}
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
}
