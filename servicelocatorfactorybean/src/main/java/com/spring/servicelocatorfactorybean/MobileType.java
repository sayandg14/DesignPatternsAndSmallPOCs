/**
 * 
 */
package com.spring.servicelocatorfactorybean;

/**
 * @author user
 *
 */
public enum MobileType {

	NOKIA("nokia") , SAMSUNG("samsung") , MI("mi") ;
	
	private final String value;
	
	MobileType(String input) {
		this.value = input;
	}
	
	public String getValue() {
		return this.value;
	}
	
	public String toString() {
		return this.value;
	}
}
