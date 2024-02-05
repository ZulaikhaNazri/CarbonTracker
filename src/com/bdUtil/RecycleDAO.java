package com.bdUtil;

import java.util.List; 

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.model.Recycle;




public class RecycleDAO {
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
	
	//getAll
		public List<Recycle> getAll(){
			String sql = "select * from recycle";
			List<Recycle> iList = jdbct.query(sql, new BeanPropertyRowMapper<Recycle>(Recycle.class));
			return iList; 
		}
		
		//getByID
		public Recycle getById(int id){
			String sql = "select * from recycle where id = ?";
			Recycle recycle = jdbct.queryForObject(sql, new BeanPropertyRowMapper<Recycle>(Recycle.class), id);
			return recycle; 
		}
		
		//add
		public int add(Recycle recycle){
			String sql = "insert into recycle (id, userId, tarikh, jumlah_recycle, jumlah_bayaran, jumlah_carbon) values ( ?, ?, ?, ?, ?, ?)";
			Object args[] = {recycle.getId(), recycle.getUserID(), recycle.getTarikh(), recycle.getJumlah_recycle(), recycle.getJumlah_bayaran(), recycle.getJumlah_carbon()};
			int rowAffected = jdbct.update(sql, args);
			return rowAffected;
		}
		
		//delete
		 public int delete(int id) {
		    String sql = "delete from recycle where id = ?";
		    int rowAffected = jdbct.update(sql, id);
		    return rowAffected;
		}
		 
		 public int update(Recycle recycle) {
		        String sql = "update recycle set userId = ?, tarikh = ?, jumlah_recycle = ?, jumlah_bayaran = ? where id = ?";

		        Object[] args = {recycle.getUserID(), recycle.getTarikh(), recycle.getJumlah_recycle(), recycle.getJumlah_bayaran(), recycle.getId()};
			    int rowAffected = jdbct.update(sql, args);
			    return rowAffected;
		 }
		// update
////		public int update(Recycle recycle) {
//			String sql = "UPDATE recycle SET userId=?, tarikh=?, jumlah_recycle=?, jumlah_bayaran=? WHERE id=?";
//			Object[] args = {recycle.getUserID(), recycle.gettarikh(), recycle.getJumlah_recycle(), recycle.getJumlah_bayaran(), recycle.getId()};
//		    int rowAffected = jdbct.update(sql, args);
//		    return rowAffected;
		 
		}


