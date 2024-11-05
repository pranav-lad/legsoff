package com.accenture.lkm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ComplaintType")
public class ComplaintTypeEntity {

	@Id
	private Integer complaintTypeId;
	private String complaintTypeName;

	public int getComplaintTypeId() {
		return complaintTypeId;
	}

	public void setComplaintTypeId(Integer complaintTypeId) {
		this.complaintTypeId = complaintTypeId;
	}

	public String getComplaintTypeName() {
		return complaintTypeName;
	}

	public void setComplaintTypeName(String complaintTypeName) {
		this.complaintTypeName = complaintTypeName;
	}
	
	
}
