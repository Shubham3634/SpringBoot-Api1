package com.emp.EmpInfo.SpringBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JbkController {

	@GetMapping("/tka")
	public List <Employee>showEmployee() {
		
		Employee emp = new Employee();
		emp.cid=101;
		emp.name="Shubham";
		emp.phoneno= "1234567891";
		emp.departmentit="The Kiran Academy";
		emp.status="Active";
		emp.createddtm=" 9:45 am";
		emp.createdby="Bhushan";
		emp.updateddtm="11:45";
		emp.updatedby="Rahul";
		emp.cid=201;
		
		
		Employee mp = new Employee();
		mp.cid=102;
		mp.name="Vaibhav";
		mp.phoneno= "12654658891";
		mp.departmentit="Testing";
		mp.status="deactivate";
		mp.createddtm=" 9:45 am";
		mp.createdby="Bhushan";
		mp.updateddtm="11:45";
		mp.updatedby="Rahul";
		mp.cid=206;
		
		ArrayList<Employee> ep = new ArrayList<Employee>();
		ep.add(emp);
		ep.add(mp);
		
		return ep;
	}

}
