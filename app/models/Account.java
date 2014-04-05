package models;

import play.data.validation.Constraints.*;
import java.util.ArrayList;
import java.util.List;

public class Account {
	public Long id;
	@Required
	@Email
	public String email;
	@Required
	public String password;

	public Account() {}
	
	
	public String toString() {
		return "account : " + email;
	}
}
