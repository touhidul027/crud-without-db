    
package test;  
    
    public class User {  
    public User( String name, String password, String email, String sex, String country) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.sex = sex;
		this.country = country;
	}
	private String name,password,email,sex,country;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", sex=" + sex + ", country=" + country + "]";
	}  
    
	
	
    }  