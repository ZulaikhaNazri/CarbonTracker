package com.bdUtil;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.model.Admin;

public class AdminDAO {

private JdbcTemplate jdbc = new JdbcTemplate(getDataSource());
	
	public DataSource getDataSource() {
        DataSource ds = null;
        String dbURL = "jdbc:mysql://localhost:3306/carbontracker";
        String adminname = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ds = new DriverManagerDataSource(dbURL, adminname, password);
        return ds;
    }
	
	// Retrieve all admins from the database
    public List<Admin> getAllAdmins() {
        String sql = "SELECT * FROM admin";
        List<Admin> uList = jdbc.query(sql, new BeanPropertyRowMapper<>(Admin.class));
        return uList;
    }
    
 // Update an existing admin in the database
    public int updateAdmin(Admin admin) {
        String sql = "UPDATE admin SET name = ?, username = ?, password = ? WHERE id = ?";
        Object args[] = {admin.getName(), admin.getUsername(), admin.getPassword(), admin.getId()};
        return jdbc.update(sql, args);
    }
}
