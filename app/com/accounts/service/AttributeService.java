package com.accounts.service;

import java.util.List;

import models.Attribute;

public interface AttributeService {
	Attribute saveAttribute(Attribute attribute);
	List<Attribute> getAttributes();
}
