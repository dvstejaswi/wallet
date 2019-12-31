package Entity;

public class Customer {
	public Customer() {}
	public String mobileno;
	public String name;
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(String mobileno, String name) {
		this.mobileno=mobileno;
		this.name=name;
		
	}
	
	
	 @Override
	    public boolean equals(Object obj) {
	        if(obj==this){
	            return true;
	        }
	        if(obj ==null|| !(obj instanceof Customer)){
	            return false;
	        }
	        Customer c=(Customer)obj;
	        return c.mobileno.equals(this.mobileno);

	    }

	    @Override
	    public int hashCode() {
	    	
	        return mobileno.hashCode();
	    }

}
