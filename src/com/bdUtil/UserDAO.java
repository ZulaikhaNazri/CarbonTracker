package com.bdUtil;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.model.User;

import javax.sql.DataSource;
import java.util.List;

public class UserDAO {

	private JdbcTemplate jdbc = new JdbcTemplate(getDataSource());
	
	public DataSource getDataSource() {
        DataSource ds = null;
        String dbURL = "jdbc:mysql://localhost:3306/carbontracker";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ds = new DriverManagerDataSource(dbURL, username, password);
        return ds;
    }
	
    // Retrieve all users from the database
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM user";
        List<User> uList = jdbc.query(sql, new BeanPropertyRowMapper<>(User.class));
        return uList;
    }

    // Retrieve a user by their ID
    public User getUserById(String id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), id);
    }
    
    // Retrieve a list of users by their name
	/*
	 * public List<User> getUsersByName(String name) { String sql =
	 * "SELECT * FROM user WHERE name LIKE ?"; String queryName = "%" + name + "%";
	 * return jdbc.query(sql, new BeanPropertyRowMapper<>(User.class), queryName); }
	 */

    // Add a new user to the database
    public int addUser(User user) {
        String sql = "INSERT INTO user (id, name, address, email, category, username, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Object args[] = {user.getId(), user.getName(), user.getAddress(), user.getEmail(), user.getCategory(), user.getUsername(), user.getPassword()};
        return jdbc.update(sql, args);
    }

    // Update an existing user in the database
    public int updateUser(User user) {
        String sql = "UPDATE user SET name = ?, address = ?, email = ?, category = ?, username = ?, password = ? WHERE id = ?";
        Object args[] = {user.getName(), user.getAddress(), user.getEmail(), user.getCategory(), user.getUsername(), user.getPassword(), user.getId()};
        return jdbc.update(sql, args);
    }

    // Delete a user from the database by their ID
    public int deleteUser(String id) {
        String sql = "DELETE FROM user WHERE id = ?";
        return jdbc.update(sql, id);
    }
}
