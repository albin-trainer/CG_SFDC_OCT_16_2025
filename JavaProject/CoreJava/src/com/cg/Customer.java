package com.cg;
public class Customer {
    //instance variables
  private  int custId;
 private   String custName;
 private   String address;

public int getCustId() {
    return custId;
}
public void setCustId(int custId) {
    if(custId>0)
    this.custId = custId;
}
public String getCustName() {
    return custName;
}
public void setCustName(String custName) {
   this.custName = custName;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
 
 
}
