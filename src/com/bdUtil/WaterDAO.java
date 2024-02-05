package com.bdUtil;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.model.Water;

public class WaterDAO {
	JdbcTemplate jdbct = new JdbcTemplate(getDataSource());
	// the details impl for all CRUD methods here

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

	// getAll
	public List<Water> getAll() {
		String sql = "select * from water";
		List<Water> iList = jdbct.query(sql, new BeanPropertyRowMapper<Water>(Water.class));
		return iList;
	}

	// getByID
	public Water getById(int id) {
		String sql = "select * from water where id = ?";
		Water water = jdbct.queryForObject(sql, new BeanPropertyRowMapper<Water>(Water.class), id);
		return water;
	}

	// add
	public int add(Water water) {
		String sql = "insert into water (id, userId, tarikh, bilangan_hari, faktor_prorata, jumlah_air, jumlah_bayaran, jumlah_karbon) values (?, ?, ?, ?, ?, ?, ?, ?)";
		Object args[] = { water.getId(), water.getUserID(), water.gettarikh(), water.getBilangan_hari(),
				water.getFaktor_prorata(), water.getJumlah_air(), water.getJumlah_bayaran(), water.getJumlah_karbon() };
		int rowAffected = jdbct.update(sql, args);
		return rowAffected;
	}

	// delete
	public int delete(int id) {
		String sql = "DELETE FROM water WHERE id = ?";
		int rowAffected = jdbct.update(sql, id);
		return rowAffected;
	}

	// update
	public int update(Water water) {
		String sql = "UPDATE water SET tarikh=?, bilangan_hari=?, faktor_prorata=?, jumlah_air=?, jumlah_bayaran=?, jumlah_karbon=? WHERE id=?";
		Object[] args = { water.gettarikh(), water.getBilangan_hari(), water.getFaktor_prorata(), water.getJumlah_air(),
				water.getJumlah_bayaran(), water.getJumlah_karbon() };
		int rowAffected = jdbct.update(sql, args);
		return rowAffected;
	}
}
