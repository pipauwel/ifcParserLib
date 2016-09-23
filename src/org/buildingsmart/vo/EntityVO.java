package org.buildingsmart.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import fi.ni.rdf.Namespace;

/*
The GNU Affero General Public License

Copyright (c) 2014 Jyrki Oraskari
Copyright (c) 2014 Pieter Pauwels (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class EntityVO implements Serializable {
	private static final long serialVersionUID = -3172893316956350157L;
	private String name;
	private List<AttributeVO> attributes = new LinkedList<AttributeVO>();
	private List<InverseVO> inverses = new LinkedList<InverseVO>();

	private List<AttributeVO> derived_attribute_list = new LinkedList<AttributeVO>();
	private List<InverseVO> derived_inverse_list = new LinkedList<InverseVO>();
	
	private String superclass;
	private boolean abstractsuperclass = false;
	private List<TypeVO> parentSelect;
	private Set<String> subClassList = new HashSet<String>();
	private static List<EntityVO> listOfEntities = new ArrayList<EntityVO>();

	public EntityVO(String name) {
		super();
		this.name = name;
		listOfEntities.add(this);
	}

	public static EntityVO getEntityVO(String EntityName) {
		for (EntityVO e : listOfEntities) {
			if (e.getName().equalsIgnoreCase(EntityName))
				return e;
		}
		return null;
	}
	
	public List<InverseVO> getDerived_inverse_list() {
		return derived_inverse_list;
	}

	public void setDerived_inverse_list(List<InverseVO> derived_inverse_list) {
		this.derived_inverse_list = derived_inverse_list;
	}

	public List<InverseVO> getInverses() {
		return inverses;
	}

	public void setInverses(List<InverseVO> inverses) {
		this.inverses = inverses;
	}

	public List<AttributeVO> getDerived_attribute_list() {
		return derived_attribute_list;
	}

	public void setDerived_attribute_list(List<AttributeVO> derived_list) {
		this.derived_attribute_list = derived_list;
	}

	public EntityVO() {
	}

	public List<AttributeVO> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<AttributeVO> attributes) {
		this.attributes = attributes;
	}

	public String getSuperclass() {
		return superclass;
	}
	
	public void setSuperclass(String superclass) {
		this.superclass = superclass;
	}	

	public List<TypeVO> getParentSelectTypes() {
		return parentSelect;
	}

	public void addParentSelectType(TypeVO parentSelect) {
		if(this.parentSelect == null)
			this.parentSelect = new ArrayList<TypeVO>();
		this.parentSelect.add(parentSelect);
	}

	public void setAbstractSuperclass(boolean abstractsuperclass){
		this.abstractsuperclass = abstractsuperclass;
	}

	public boolean isAbstractSuperclass(){
		return abstractsuperclass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "EntityVO [name=" + name + ", attributes=" + attributes
				+ ", inverses=" + inverses 
				+ ", derived_attribute_list=" + derived_attribute_list
				+ ", derived_inverse_list=" + derived_inverse_list
				+ ", superclass=" + superclass 
				+ ", abstractsuperclass=" + abstractsuperclass + "]";
	}

	/**
	 * @return the subClassList
	 */
	public Set<String> getSubClassList() {
		return subClassList;
	}

	/**
	 * @param subClassList the subClassList to set
	 */
	public void setSubClassList(Set<String> subClassList) {
		this.subClassList = subClassList;
	}
}
