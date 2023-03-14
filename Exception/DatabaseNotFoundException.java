package jspiders.springBoot.Exception;

public class DatabaseNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Resource;
	private String fieldname;
	private Object fieldvalue;
	public DatabaseNotFoundException(String resource, String fieldname, Object fieldvalue) {
		super(resource+"not found for"+fieldname+"and value"+fieldvalue);
		Resource = resource;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
	public String getResource() {
		return Resource;
	}
	public void setResource(String resource) {
		Resource = resource;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	public Object getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(Object fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
