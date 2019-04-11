package com.grocerry.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Supplier 
{
@Id
@GeneratedValue
 
int supplierid;
String supplierName;
String address;


public int getSupplierid() {
	return supplierid;
}
public void setSupplierid(int supplierid) {
	this.supplierid = supplierid;
}
public String getSupplierName() {
	return supplierName;
}
public void setSupplierName(String supplierName) {
	this.supplierName = supplierName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}





}
