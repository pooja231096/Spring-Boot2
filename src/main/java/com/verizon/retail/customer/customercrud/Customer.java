package com.verizon.retail.customer.customercrud;
import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.internal.NotNull;
public class Customer {
@Size(min=5,max=10,message="name length should be between 5 and 10")
private String name;
private int areacode,phoneno;
@PastOrPresent
@JsonFormat(pattern="yyyy-MM-dd")
private LocalDate datevisited;
@Email
private String email;
public String getName() {
	return name;
}
public int getPhoneno() {
	return phoneno;
}
public void setPhoneno(int phoneno) {
	this.phoneno = phoneno;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAreacode() {
	return areacode;
}
public void setAreacode(int areacode) {
	this.areacode = areacode;
}
public LocalDate getDatevisited() {
	return datevisited;
}
public void setDatevisited(LocalDate datevisited) {
	this.datevisited = datevisited;
}

}
