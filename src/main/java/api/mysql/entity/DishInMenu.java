package api.mysql.entity;
import api.mysql.controller.*;
import api.mysql.repo.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Таблица блюд

@Entity
public class DishInMenu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String dishId; 
	
	private String dishAmount; 
	
	private java.sql.Time menuId;
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDishId() {
		return dishId;
	}

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}

	public String getDishAmount() {
		return dishAmount;
	}

	public void setDishAmount(String dishAmount) {
		this.dishAmount = dishAmount;
	}

	public java.sql.Time getMenuId() {
		return menuId;
	}

	public void setMenuId(java.sql.Time menuId) {
		this.menuId = menuId;
	}
	
}
