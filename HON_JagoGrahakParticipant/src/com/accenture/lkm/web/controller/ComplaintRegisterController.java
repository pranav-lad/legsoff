package com.accenture.lkm.web.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.business.bean.ComplaintBean;
import com.accenture.lkm.service.ComplaintService;

@Controller
public class ComplaintRegisterController {

	@Autowired
	private ComplaintService complaintService;

	/**
     * This method is used to load the complaint form page.
     *
     * @return ModelAndView object for the complaint form page.
     */
	@RequestMapping("loadComplaintPage")
	public ModelAndView loadComplaintForm() {
		 // Your implementation goes here
		return new ModelAndView("ComplaintPage", "complaintBean", new ComplaintBean());
	}

	/**
     * To-Do Item 1.9: This method is used to process the submitted complaint form and save the Complaint Details.
     *
     * Steps to Implement:
     * 1. Map the URL to /complaintForm.
     * 2. Check if there are any validation errors in the form submission result.
     * 3. If there are validation errors, set the view name to "ComplaintPage" and return ModelAndView object.
     * 4. If there are no validation errors, call complaintService.registerComplaintDetails() to register the complaint details.
     * 5. Set the view name to "Success" and add a success message "Hi <<customerName>>  your complaint is successfully registered." to the ModelAndView object.
     *
     * @param complaintBean The ComplaintBean containing the submitted complaint details.
     * @param result The BindingResult containing the validation errors, if any.
     * @return ModelAndView object with appropriate view and message based on form processing.
     * @throws Exception if there is an error during complaint registration.
     */
	public ModelAndView processComplaintForm(@ModelAttribute("complaintBean") @Valid ComplaintBean complaintBean,BindingResult result) throws Exception {
		 // Your implementation goes here
        return null;
	}

	/**
     * To-Do Item 1.10: This method should retrieve all complaint types and should populate all Complaint types dynamically in the form.
     *
     * Steps to Implement:
     * 1. Call complaintService.getAllComplaintTypes() to retrieve all complaint types.
     * 2. Return the map of complaint types.
     *
     * @return Map<Integer, String> containing complaint type IDs mapped to their names.
     */
	public Map<Integer, String> getAllComplaintTypes() {
		 // Your implementation goes here
        return null;
	}

	/**
     * To-Do Item 1.11: This method should handle common exceptions.
     *
     * Steps to Implement:
     * 1. Create a ModelAndView object.
     * 2. Set the view name to "GeneralizedExceptionHandlerPage".
     * 3. Add the exception message and the exception itself as attributes to the ModelAndView object.
     * 4. Return the ModelAndView object.
     *
     * @param exception The exception to handle.
     * @return ModelAndView object for displaying exception details.
     */
	public ModelAndView handleAllExceptions(Exception exception) {
		 // Your implementation goes here
        return null;
	}
}
