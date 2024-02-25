package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="regesUsers")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private long id;

	@Column(name="email")
	private String email;
	
	
	@Column(name="password")
	private String password;

	
	@Column(name="username")
	private String username;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String name) {
		this.username = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(long id, String name, String email, String password) {
		this.id = id;
		this.username = name;
		this.email = email;
		this.password = password;
	}

	public User() {
        //TODO Auto-generated constructor stub
    }

    @Override
	public String toString() {
		return "User [id=" + id + ", name=" + username + ", email=" + email + ", password=" + password + "]";
	}

}
