package com.BT.spring.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.BT.spring.springjdbc.employee.dao.EmployeeDao;
import com.BT.spring.springjdbc.employee.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql="insert into employee values(?,?,?)";
		int result=jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql="update employee set firstname=?,lastname=? where id=?";
		int j = jdbcTemplate.update(sql,employee.getFirstName(),employee.getLastName(),employee.getId());
		return j;
	}

	@Override
	public int delete(int id) {
		String sql="delete from employee where id=?";
		int k = jdbcTemplate.update(sql,id);
		return k;
	}

}
