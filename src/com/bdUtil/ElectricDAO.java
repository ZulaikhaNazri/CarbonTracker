package com.bdUtil;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.model.Electric;

public class ElectricDAO {
	JdbcTemplate jdbct = new JdbcTemplate(getDataSource());
	// the details implementation for all CRUD methods here
	
	public DataSource getDataSource() {
		DataSource ds = null;
		
		String dbURL = "jdbc:mysql://localhost:3306/carbontracker";
		String username = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		ds = new DriverManagerDataSource(dbURL, username, password);
		return ds;
	}
	
	//getAll
	public List<Electric> getAll(){
		String sql = "select * from electric";
		List<Electric> eList = jdbct.query(sql, new BeanPropertyRowMapper<Electric>(Electric.class));
		return eList; //list of all Electrics in database table
	}
	
	//getByID
	public Electric getById(int id){
		String sql = "select * from electric where id = ?";
		Electric elec = jdbct.queryForObject(sql, new BeanPropertyRowMapper<Electric>(Electric.class), id);
		return elec; //get Electric info in database table
	}
	
	//add
	public int add(Electric elec){
	    String sql = "INSERT into electric (id, userId, bulan, bilangan_hari, faktor_prorata, jumlah_elektrik, jumlah_bayaran, jumlah_karbon) values (?, ?, ?, ?, ?, ?, ?, ?)";
	    Object args[] = {elec.getId(), elec.getUserId(), elec.getBulan(), elec.getBilangan_hari(), elec.getFaktor_prorata(), elec.getJumlah_elektrik(), elec.getJumlah_bayaran(), elec.getJumlah_karbon()};
	    int rowAffected = jdbct.update(sql, args);
	    return rowAffected;
	}
	
	//delete
	public int delete(int id) {
	    String sql = "DELETE FROM electric WHERE id = ?";
	    int rowAffected = jdbct.update(sql, id);
	    return rowAffected;
	}
	// update
	public int update(Electric elec) {
	    String sql = "UPDATE electric SET bulan=?, bilangan_hari=?, faktor_prorata=?, jumlah_elektrik=?, jumlah_bayaran=?, jumlah_karbon=? WHERE id=?";		   
	    Object[] args = { elec.getBulan(), elec.getBilangan_hari(), elec.getFaktor_prorata(), elec.getJumlah_elektrik(), elec.getJumlah_bayaran(), elec.getJumlah_karbon(), elec.getId() };
	    int rowAffected = jdbct.update(sql, args);
	    return rowAffected;
	}

}
