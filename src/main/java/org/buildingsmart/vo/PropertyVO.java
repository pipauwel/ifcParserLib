package org.buildingsmart.vo;

import java.io.Serializable;
import java.util.List;

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

public class PropertyVO implements Serializable {
    private static final long serialVersionUID = 3706277260287854899L;
    private String name;
    private String originalName;
    private EntityVO domain;

    public enum propertyType {
        TypeVO, EntityVO, Select
    };

    private propertyType type;
    private boolean optional = false;
    private String rangeNS;

    private boolean isArray = false;
    private boolean isSet = false;
    private boolean isList = false;
    private int minCardinality = -1;
    private int maxCardinality = -1;

    private boolean listOfList = false;
    private int minCardinality_listoflist = -1;
    private int maxCardinality_listoflist = -1;

    private PropertyVO inverseProperty = null;

    private List<String> range_selectEntities = null;
    private String range = null;

    // List<String> ifcClasses = new ArrayList<String>();
    // public boolean isEntity = false;
    // String rawtype;
    // public boolean isEnumeration = false;
    // List<String> enumeration_list = null;

    public PropertyVO() {
        // basic constructor
    }

    // public PropertyVO(String name, boolean isList, boolean isEntity,
    // String rawtype, boolean isEnumeration, List<String> enumeration_list) {
    // super();
    // this.name = name;
    // this.isList = isList;
    // this.isEntity = isEntity;
    // this.rawtype = rawtype;
    // this.isEnumeration = isEnumeration;
    // this.enumeration_list = enumeration_list;
    // }
    //
    // public PropertyVO(String name, boolean isList, boolean isEntity,
    // String rawtype) {
    // super();
    // this.name = name;
    // this.isList = isList;
    // this.isEntity = isEntity;
    // this.rawtype = rawtype;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLowerCaseName() {
        return Character.toLowerCase(name.charAt(0)) + name.substring(1);
    }

    public String getOriginalNameLowerCase() {
        return Character.toLowerCase(originalName.charAt(0)) + originalName.substring(1);
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public EntityVO getDomain() {
        return domain;
    }

    public void setDomain(EntityVO domain) {
        this.domain = domain;
    }

    public propertyType getType() {
        return type;
    }

    public void setType(propertyType type) {
        this.type = type;
    }

    public boolean isArray() {
        return isArray;
    }

    public void setArray(boolean isArray) {
        this.isArray = isArray;
    }

    public boolean isSet() {
        return isSet;
    }

    public void setSet(boolean isSet) {
        this.isSet = isSet;
    }

    public boolean isList() {
        return isList;
    }

    public void setList(boolean isList) {
        this.isList = isList;
    }

    public boolean isListOfList() {
        return listOfList;
    }

    public void setListOfList(boolean listOfList) {
        this.listOfList = listOfList;
    }

    public List<String> getSelectEntities() {
        return range_selectEntities;
    }

    public void setSelectEntities(List<String> selectEntities) {
        this.range_selectEntities = selectEntities;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public int getMinCardinality() {
        return minCardinality;
    }

    public void setMinCardinality(int minCardinality) {
        this.minCardinality = minCardinality;
    }

    public int getMaxCardinality() {
        return maxCardinality;
    }

    public void setMaxCardinality(int maxCardinality) {
        this.maxCardinality = maxCardinality;
    }

    public int getMinCardinality_listoflist() {
        return minCardinality_listoflist;
    }

    public void setMinCardinality_listoflist(int minCardinality_listoflist) {
        this.minCardinality_listoflist = minCardinality_listoflist;
    }

    public int getMaxCardinality_listoflist() {
        return maxCardinality_listoflist;
    }

    public void setMaxCardinality_listoflist(int maxCardinality_listoflist) {
        this.maxCardinality_listoflist = maxCardinality_listoflist;
    }

    public PropertyVO getInverseProperty() {
        return inverseProperty;
    }

    public void setInverseProp(PropertyVO inverseProperty) {
        this.inverseProperty = inverseProperty;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public String getRangeNS() {
        return rangeNS;
    }

    public void setRangeNS(String rangeNS) {
        this.rangeNS = rangeNS;
    }

    // public boolean containsIfcClass(Object o) {
    // return ifcClasses.contains(o);
    // }
    //
    // public boolean addIfcClass(String e) {
    // return ifcClasses.add(e);
    // }
    //
    // public List<String> getIfcClasses() {
    // return ifcClasses;
    // }
    //
    // public void setIfcClasses(List<String> ifcClasses) {
    // this.ifcClasses = ifcClasses;
    // }
    //
    // public String getIfcClassesAsString() {
    // StringBuffer sb = new StringBuffer();
    // for (int n = 0; n < ifcClasses.size(); n++) {
    // if (n > 0)
    // sb.append(' ');
    // sb.append("ifc:" + ifcClasses.get(n));
    // }
    // return sb.toString();
    // }

    // public String getRawtype() {
    // return rawtype;
    // }
    //
    // public void setRawtype(String rawtype) {
    // this.rawtype = rawtype;
    // }

    // public boolean isEntity() {
    // return isEntity;
    // }
    //
    // public void setEntity(boolean isEntity) {
    // this.isEntity = isEntity;
    // }

    // public boolean isEnumeration() {
    // return isEnumeration;
    // }
    //
    // public void setEnumeration(boolean isEnumeration) {
    // this.isEnumeration = isEnumeration;
    // }

    // public List<String> getEnumeration_list() {
    // return enumeration_list;
    // }

    // public void setEnumeration_list(List<String> enumeration_list) {
    // this.enumeration_list = enumeration_list;
    // }

    // public String getEnumerationsAsString() {
    // StringBuffer sb = new StringBuffer();
    // for (int n = 0; n < enumeration_list.size(); n++) {
    // if (n > 0)
    // sb.append(' ');
    // sb.append("ifc:" + enumeration_list.get(n));
    // }
    // return sb.toString();
    // }

}
