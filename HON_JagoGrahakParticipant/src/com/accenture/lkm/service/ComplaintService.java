package com.accenture.lkm.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.accenture.lkm.business.bean.ComplaintBean;

public interface ComplaintService {

	public int registerComplaintDetails(ComplaintBean complaintBean) throws Exception;
	public List<ComplaintBean> getComplaintDetailsByDate(Date fromDate,Date toDate);
	public Map<Integer,String> getAllComplaintTypes();
	
}
