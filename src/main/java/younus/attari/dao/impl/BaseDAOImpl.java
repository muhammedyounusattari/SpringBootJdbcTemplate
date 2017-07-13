package younus.attari.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import younus.attari.config.SpringPropertiesPlaceHolder;
import younus.attari.dao.BaseDAO;

@Repository
public class BaseDAOImpl implements BaseDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	SpringPropertiesPlaceHolder placeHolder;

	@Override
	public String firstDAO() {
		System.out.println("this is from firstDAO...." + jdbcTemplate);
		String sql = placeHolder.getProperty("getUsers").trim();
		System.out.println(sql);
		insert(sql);
		read(sql);
		update(sql);
		delete(sql);

		// jdbcTemplate.execute(sql);
		return null;
	}

	public String insert(String sql) {
	//	jdbcTemplate.update(sql);
		return null;
	}

	public String read(String sql) {
		List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
		for(Map<String,Object> data:list){
			System.out.println(data);
		}
		return null;
	}

	public String update(String sql) {
	//	jdbcTemplate.update(sql);
		return null;
	}

	public String delete(String sql) {
	//	jdbcTemplate.update(sql);
		return null;
	}
}
