package models;

import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.ObjectId;
import play.data.validation.Constraints.Required;

/**

@Author	Pramod
Email:sendpramod@gmail.com
 */
public class Attribute {
	@Id
	@ObjectId
	public String id;

	@Required
	public String name;

	public String description;

}


