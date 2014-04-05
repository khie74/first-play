package controllers;

import play.*;
import play.mvc.*;
import models.Account;
import play.data.Form;


import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("My first Playframework is ready."));
    }

    public static Result loginForm() {
    	return ok(views.html.login.render(Form.form(Account.class)));
    }
    
    public static Result login() {
    	Form<Account> accountForm = Form.form(Account.class).bindFromRequest();
    	if(accountForm.hasErrors()) {
    		return badRequest(views.html.login.render(accountForm));
    	}
    	return TODO;
    }
    
}
