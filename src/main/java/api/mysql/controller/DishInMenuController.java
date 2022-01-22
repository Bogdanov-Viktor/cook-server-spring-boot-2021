package api.mysql.controller;
import api.mysql.entity.*;
import api.mysql.repo.*;

//GET / dishInMenu.delete?menu=2&access_token="9h9er798”
//{ status : true}
//GET / dishInMenu.search?menu=1&access_token="9h9er798”
//{ status : true, value : { id : 1, menu_id:22, dish_id:22, dish _amount_in_menu:211}}
//POST / dishInMenu.edit?access_token="9h9er798”
//{ id : 1, menu_id:22, dish_id:22, dish _amount_in_menu:211}
//Response :       { status : true}
//GET / dishInMenu.delete?id=2&access_token="9h9er798”
//{ status : true}
//POST / dishInMenu.add?access_token="9h9er798”
//[{menu_id:22, dish_id:22, dish _amount_in_menu:211},
//{menu_id:22, dish_id:22, dish _amount_in_menu:211}]
//Response :       { status : true}


public class DishInMenuController {

	public DishInMenuController() {
		// TODO Auto-generated constructor stub
	}

}
