package idv.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import idv.emp.dao.EmpVODao;
import idv.emp.model.Emp2;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping(value = "/emp", method = RequestMethod.GET)
public class EmpController {
	
	@Autowired
	private EmpVODao empVODao;

	@RequestMapping(value = { "/goToMaint" })
	public String goToMaint(Model model) {
		List<Emp2> list= empVODao.findAll();
		return "emp/NewFile";
	}
	
	@RequestMapping(value = { "/goToMaint2" })
	public String goToMaint2(Model model) {
		List<Emp2> list= empVODao.findAll();
		return "emp/index";
	}
}
