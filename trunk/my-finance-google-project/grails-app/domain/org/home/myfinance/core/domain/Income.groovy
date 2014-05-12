package org.home.myfinance.core.domain

class Income {
	String incomeName
	String displayName
	String description
	Date dateCreated
	Date lastUpdated 
    String createdBy
	String lastUpdatedBy	
	
	static belongsTo = [user: User]

    static constraints = {
    	description (nullable: true)
    }   
   
}
