package com.hrmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrmanagement.Entity.Certification;
import com.hrmanagement.Entity.Login;
import com.hrmanagement.Entity.Office;
import com.hrmanagement.Service.OfficeService;


@RestController
@CrossOrigin(origins = "*")
public class OfficeController {

	

	
		
		@Autowired
		OfficeService ofsv;
		
		@PostMapping("/officeSave")
		public Office  saveAlloffice(@RequestBody Office officeobj)
		{
		return ofsv.saveOffice(officeobj);
		}
		
		
		//get all OFFICEDETAILS
				@GetMapping("/getOffice")
				public List<Office> getAllOfficeDetails()
				{
				return ofsv.getAllOfficeDet();
				}
				 @GetMapping("/getOffice/{office_Id}") 
				   public  Office getOfficeById(@PathVariable("office_Id") long office_Id)
				   {
					 Office offices =ofsv.getAllOfficeById(office_Id);
								
						
						return offices;
					
						
					}
				 @GetMapping("/getOfficeInactive")
					public List<Office>  getAllOfficeInactiveDetails()
					{
					return ofsv.getAllOfficeInactiveDet();
					}
				 
				 
				 @PutMapping("/getOfficeUpdate/{office_Id}")
				    public Office updateOffice(@PathVariable("office_Id") long office_Id,@RequestBody Office obj)
				    {
					   Office obj2 = ofsv.getOfficeUpdateById(office_Id,obj);
						
						return obj2;
				    }
			 @PutMapping("/OfficeUpdateStatus/{office_Id}")
				   public Office updateOfficeStatus(@PathVariable("office_Id") long office_Id,@RequestBody Office obj)
				    {
				 //System.out.println("certi"+office_Id);
					   Office obj2 = ofsv.getOfficeStatusUpdateById(office_Id,obj);
						
						return obj2;
				   }
			 
			 @PutMapping("/StatusToActive/{office_Id}")
			 public Office updateOfficeStatusToActive(@PathVariable("office_Id") long office_Id)
			  {
				 System.out.println("enter line");
				   Office obj2 = ofsv.getOfficeStatusUpdateActiveById(office_Id);
					
					return obj2;
			 }
					   
					       
}
/
x
X
