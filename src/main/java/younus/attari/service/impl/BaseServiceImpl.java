package younus.attari.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import younus.attari.dao.BaseDAO;
import younus.attari.service.BaseService;

@Service
public class BaseServiceImpl implements BaseService {

	@Autowired
	BaseDAO baseDAO;
	
	@Override
	public String getFirstService() {
		System.out.println("this is from getFirstService()....");
		baseDAO.firstDAO();
		return null;
	}

}
