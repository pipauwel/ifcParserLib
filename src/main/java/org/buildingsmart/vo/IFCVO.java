package org.buildingsmart.vo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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

    private Long lineNum;
    private String fullLineAfterNum;
    private String name = null;
    private LinkedList<Object> list = new LinkedList<>();
    private Map<String, LinkedList<IFCVO>> inversePointerSets = new HashMap<>();

    public IFCVO() {
        //default constructor
    }

    public String getFullLineAfterNum() {
        return fullLineAfterNum;
    }

    public void setFullLineAfterNum(String fullLineAfterNum) {
        this.fullLineAfterNum = fullLineAfterNum;
    }

    public Long getLineNum() {
        return lineNum;
    }

    public void setLineNum(Long lineNum) {
        this.lineNum = lineNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getObjectList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = (LinkedList<Object>) list;
    }

    public Map<String, LinkedList<IFCVO>> getInversePointerSets() {
        return inversePointerSets;
    }

    public void setInversePointerSets(Map<String, LinkedList<IFCVO>> inversePointerSets) {
        this.inversePointerSets = inversePointerSets;
    }
}