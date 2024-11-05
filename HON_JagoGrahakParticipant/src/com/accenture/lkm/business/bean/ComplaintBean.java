package com.accenture.lkm.business.bean;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class ComplaintBean {

	/**	 
	 To-Do Item 1.12: Use Spring MVC standard validation
	 TODO:
	 	-- Ensure customerName,dateOfIncidence, amount and complaintTypeId is a mandatory field.
	 	-- Validate dateOfIncidence to be in format of dd-MMM-yyyy
	 	-- Validate dateOfIncidence to be the past date
	 */
	private Integer complaintId;
	private String customerName;
	private String description;
	private Date dateOfIncidence;
	private Double amount;
	private Integer complaintTypeId;

	public Integer getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(Integer complaintId) {
		this.complaintId = complaintId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	public Integer getComplaintTypeId() {
		return complaintTypeId;
	}

	public void setComplaintTypeId(Integer complaintTypeId) {
		this.complaintTypeId = complaintTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateOfIncidence() {
		return dateOfIncidence;
	}

	public void setDateOfIncidence(Date dateOfIncidence) {
		this.dateOfIncidence = dateOfIncidence;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
