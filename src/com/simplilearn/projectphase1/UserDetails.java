package com.simplilearn.projectphase1;

public class UserDetails {
	 private String username;
	   private String password;
	   
	   
	   
	    public UserDetails(String username, String password) {
		
		this.username = username;
		this.password = password;
	}
	    public String getusername() {
			return username;
		}

		public UserDetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		public void setusername(String username) {
			this.username = username;
		}

		public String getpassword() {
			return password;
		}

		public void setpassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Users [username=" + username + ", password=" + password + "]";
		}
}
