package com.accenture.lkm.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.business.bean.ComplaintBean;
import com.accenture.lkm.business.bean.ComplaintTypeBean;
import com.accenture.lkm.dao.ComplaintDaoWrapper;

@Service
public class ComplaintServiceImpl implements ComplaintService {

	@Autowired
	private ComplaintDaoWrapper complaintDaoWrapper;

	/**
     * 
     * To-Do Item 1.6: This method should register complaint details.
	 * 			
     * Steps to Implement:
     * 1. Call complaintDaoWrapper.getCustomerByComplaintType() to check if the customer has already submitted a complaint of the same type.
     * 2. If count is 1, throw an Exception with a message indicating that the customer has already submitted a complaint with the same type.
     * 3. Otherwise, call complaintDaoWrapper.registerComplaintDetails() to register the complaint details.
     *
     * @param complaintBean The ComplaintBean containing details of the complaint.
     * @throws Exception if the customer has already submitted a complaint with the same type.
     */
	public int registerComplaintDetails(ComplaintBean complaintBean) throws Exception {
		// Your implementation goes here
		return 0;
	}

	/**
     * To-Do Item 1.7: This method should retrieve complaint details by date range.
     *
     * Steps to Implement:
     * 1. Call complaintDaoWrapper.getComplaintDetailsByDate() to retrieve complaint details within the specified date range.
     *
     * @param fromDate The start date of the date range.
     * @param toDate The end date of the date range.
     * @return List of ComplaintBean within the specified date range.
     */
	@Override
	public List<ComplaintBean> getComplaintDetailsByDate(Date fromDate, Date toDate) {
		// Your implementation goes here
		return null;
	}

	/**
     * To-Do Item 1.8: This method should retrieve all complaint types.
     *
     * Steps to Implement:
     * 1. Call complaintDaoWrapper.getAllComplaintTypes() to retrieve all complaint types.
     * 2. Iterate over the list of ComplaintTypeBean and construct a map of complaint type IDs to names.
     *
     * @return Map<Integer, String> containing complaint type IDs mapped to their names.
     */
	@Override
	public Map<Integer, String> getAllComplaintTypes() {
		// Your implementation goes here
		return null;
	}
}
