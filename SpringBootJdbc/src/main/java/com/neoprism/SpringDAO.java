package com.neoprism;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class SpringDAO extends JdbcDaoSupport {
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}
	public void insert() {
		getJdbcTemplate().execute("insert into student values(1000,'Rom',999,'B','CSE')");
	}
	public void update() {
		getJdbcTemplate().execute("update student set marks=400 where id=1000");
	}
	public void delete() {
		getJdbcTemplate().execute("delete from student where id=3");
	}
	public void select() {
		List<Map<String,Object>> li=getJdbcTemplate().queryForList("select * from student");
		Iterator<Map<String,Object>> i=li.iterator();
		while(i.hasNext()){
			Map<String,Object> m=i.next();
			System.out.println(m);
			
		}
	}

}
