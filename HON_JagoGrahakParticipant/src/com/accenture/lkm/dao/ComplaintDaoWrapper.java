package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.business.bean.ComplaintBean;
import com.accenture.lkm.business.bean.ComplaintTypeBean;
import com.accenture.lkm.entity.ComplaintEntity;
import com.accenture.lkm.entity.ComplaintTypeEntity;

@Repository
@Transactional(value = "txManager")
public class ComplaintDaoWrapper {

	@Autowired
	private ComplaintDao complaintDao;

	@Autowired
	private ComplaintTypeDao complaintTypeDao;

	@PersistenceContext
	private EntityManager manager;

	/** 
     *  To-Do Item 1.3: This method should register complaint details.
	 * 			NOTE:This requirement needs to be implemented using Spring JPA Data.
     *
     * Steps to Implement:
     * 1. Create a new ComplaintEntity object.
     * 2. Copy properties from the ComplaintBean to the ComplaintEntity using BeanUtils.copyProperties().
     * 3. Save the ComplaintEntity by calling appropriate method from complaintDao.
     *
     * @param complaintBean The ComplaintBean containing details of the complaint.
     * @return complaint id.
     */
	public int registerComplaintDetails(ComplaintBean complaintBean) {
		// Your implementation goes here
		return 0;
    }

	/**
     * To-Do Item 1.4: This method should Retrieve complaint details by date range.
	 * 			NOTE:This requirement needs to be implemented using using JPA EntityManager.
	 * 
     * Steps to Implement:
     * 1. Create a named query "getComplaintDetailsByDate" using the entity manager.
     * 2. Set parameters in the query for fromDate and toDate.
     * 3. Execute the query using getResultList() to get a list of ComplaintEntity.
     * 4. Iterate over the entities, copy properties to ComplaintBean, and add to the list.
     * 5. Return the list of ComplaintBean.
     *
     * @param fromDate The start date of the date range.
     * @param toDate The end date of the date range.
     * @return List of ComplaintBean within the specified date range.
     */ 
	
	public List<ComplaintBean> getComplaintDetailsByDate(Date fromDate, Date toDate) {
		// Your implementation goes here
        return null;
	}

	/**
     * To-Do Item 1.5: This method should Retrieve all complaint types.
	 * 			NOTE:This requirement needs to be implemented using using Spring JPA Data.
	 * 
     * Steps to Implement:
     * 1. Retrieve all ComplaintTypeEntity by calling appropriate method from complaintTypeDao.
     * 2. Iterate over the entities, copy properties to ComplaintTypeBean, and add to the list.
     * 3. Return the list of ComplaintTypeBean.
     *
     * @return List of all ComplaintTypeBean.
     */
	public List<ComplaintTypeBean> getAllComplaintTypes() {
		// Your implementation goes here
        return null;
	}

	/**
     * This method should Check if a customer has a complaint of a specific type.
	 * 
     * @param customerName The name of the customer.
     * @param complaintTypeId The ID of the complaint type.
     * @return 1 if the customer has a complaint of the specified type, 0 otherwise.
     */
	public int getCustomerByComplaintType(String customerName, int complaintTypeId) {
		ComplaintEntity complaintEntity = complaintDao.getCustomerByComplaintType(customerName, complaintTypeId);
		if(complaintEntity!=null)
			return 1;
		return 0;
	}
	
}
