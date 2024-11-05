package com.accenture.lkm.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.business.bean.ComplaintBean;
import com.accenture.lkm.business.bean.DateRangeBean;
import com.accenture.lkm.service.ComplaintService;

@Controller
public class ComplaintReportController {

	@Autowired
	private ComplaintService complaintService;

	@RequestMapping("dateForm")
	public ModelAndView loadComplaintReport() {
		return new ModelAndView("ComplaintReport", "dateRangeBean", new DateRangeBean());
	}

	@RequestMapping(value = "complaintReportForm", method = RequestMethod.POST)
	public ModelAndView getComplaintDetailsByDate(@ModelAttribute("dateRangeBean") DateRangeBean dateRange) {
		List<ComplaintBean> complaintBeans = complaintService.getComplaintDetailsByDate(dateRange.getFromDate(),dateRange.getToDate());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ShowComplaintDetails");
		mv.addObject("complaintBeans", complaintBeans);
		return mv;
	}
}
