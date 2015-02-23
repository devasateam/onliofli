package com.ecommerce.model.dao.utils;

import net.vz.mongodb.jackson.JacksonDBCollection;
import play.modules.mongodb.jackson.MongoDB;

/**
 * @Author Pramod Email:sendpramod@gmail.com
 */
public class DbJSONUtils<T,K> {
	public  JacksonDBCollection<T, K> getDbCollection(
			String collectionName, Class entityClazz, Class keyClass) {
		return MongoDB.getCollection(collectionName, entityClazz, keyClass);

	}
}
