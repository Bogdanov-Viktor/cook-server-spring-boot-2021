package api.mysql.controller;
import api.mysql.entity.*;
import api.mysql.repo.*;

//GET /menu.getAll?access_token="9h9er798”
//{ status : true, value : [{ id : 1, name : “Банкетное” }, { id : 2, name : “Банкетное 2” }] }
//POST /menu.edit?access_token="9h9er798”
//{ id : 1, name : “Банкетное” }
//Response :       { status : true}
//POST /menu.add?access_token="9h9er798”
//{ id : 1, name : “Банкетное” }
//Response :       { status : true}
//GET / menu.delete?id=2&access_token="9h9er798”
//{ status : true}
//{ status : false}

public class MenuController {

	public MenuController() {
		// TODO Auto-generated constructor stub
	}

}
