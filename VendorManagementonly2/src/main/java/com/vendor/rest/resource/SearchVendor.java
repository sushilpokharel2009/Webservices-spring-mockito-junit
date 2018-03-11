package com.vendor.rest.resource;

import java.util.List;

import com.vendor.rest.vo.VendorVO;

public class SearchVendor {
	
	private List<VendorVO> vendors;

	public List<VendorVO> getVendors() {
		return vendors;
	}

	public void setVendors(List<VendorVO> vendors) {
		this.vendors = vendors;
	}

	public SearchVendor() {
		
	}

	public SearchVendor(List<VendorVO> vendors) {
		super();
		this.vendors = vendors;
	}
	
	
}
