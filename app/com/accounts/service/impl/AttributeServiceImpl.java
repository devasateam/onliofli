package com.accounts.service.impl;

import java.util.List;

import models.Attribute;

import com.accounts.service.AttributeService;
import com.ecommerce.model.dao.AttributeDao;

public class AttributeServiceImpl implements AttributeService {

	@Override
	public Attribute saveAttribute(Attribute attribute) {
		return AttributeDao.create(attribute);
	}

	@Override
	public List<Attribute> getAttributes() {
		return AttributeDao.all();
	}

}
