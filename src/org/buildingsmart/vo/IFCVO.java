package org.buildingsmart.vo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
 * class used for parsing an IFC instance model
 * 
 * @author Jyrki Oraskari
 * 
 * The GNU Affero General Public License
 * 
 * Copyright (c) 2014 Jyrki Oraskari
 * Copyright (c) 2014 Pieter Pauwels (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

public class IFCVO {
	
    private Long line_num ;	
	private String fullLineAfterNum;
    private String name = null;
	private LinkedList<Object> list = new LinkedList<Object>();	
	private Map<String,LinkedList<IFCVO>> inverse_pointer_sets = new HashMap<String,LinkedList<IFCVO>>();


	public IFCVO() {}
	
	
	public String getFullLineAfterNum() {
		return fullLineAfterNum;
	}

	public void setFullLineAfterNum(String fullLineAfterNum) {
		this.fullLineAfterNum = fullLineAfterNum;
	}
	
	public Long getLine_num() {
		return line_num;
	}
	
	public void setLine_num(Long line_num) {
		this.line_num = line_num;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LinkedList<Object> getObjectList() {
		return list;
	}
	
	public void setList(LinkedList<Object> list) {
		this.list = list;
	}
	
	public Map<String,LinkedList<IFCVO>> getInverse_pointer_sets() {
		return inverse_pointer_sets;
	}

	public void setInverse_pointer_sets(Map<String,LinkedList<IFCVO>> inverse_pointer_sets) {
		this.inverse_pointer_sets = inverse_pointer_sets;
	}
}