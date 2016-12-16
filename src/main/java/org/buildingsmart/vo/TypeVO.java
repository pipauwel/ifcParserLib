/*
The GNU Affero General Public License

Copyright (c) 2014 Jyrki Oraskari

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

package org.buildingsmart.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TypeVO implements Serializable {
    private static final long serialVersionUID = -3366648676376786356L;
    private String name;
    private String primarytype;
    private List<String> selectEntities = new LinkedList<>();
    private List<String> enumEntities = new LinkedList<>();
    private List<TypeVO> parentSelect;
    private int[] listCardinalities = new int[2];
    private static List<TypeVO> listOfTypes = new ArrayList<>();

    public TypeVO(String name) {
        super();
        this.name = name;
        this.primarytype = name;
        listOfTypes.add(this);
    }

    public TypeVO(String name, String primarytype) {
        super();
        this.name = name;
        this.primarytype = primarytype;
        listOfTypes.add(this);
    }

    public static TypeVO getTypeVO(String typeName) {
        for (TypeVO t : listOfTypes) {
            if (t.getName().equalsIgnoreCase(typeName))
                return t;
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSelectEntities() {
        return selectEntities;
    }

    public void setSelectEntities(List<String> selectEntities) {
        this.selectEntities = selectEntities;
    }

    public List<TypeVO> getParentSelectTypes() {
        return parentSelect;
    }

    public void addParentSelectType(TypeVO parentSelect) {
        if (this.parentSelect == null)
            this.parentSelect = new ArrayList<>();
        this.parentSelect.add(parentSelect);
    }

    public String getPrimarytype() {
        return primarytype;
    }

    public void setPrimarytype(String primarytype) {
        this.primarytype = primarytype;
    }

    public List<String> getEnumEntities() {
        return enumEntities;
    }

    public void setEnumEntities(List<String> enumEntities) {
        this.enumEntities = enumEntities;
    }

    public int[] getListCardinalities() {
        return listCardinalities;
    }

    public void setListCardinalities(int[] listCardinalities) {
        this.listCardinalities = listCardinalities;
    }

    public static boolean checkIfType(String ptype) {
        for (TypeVO pt : listOfTypes) {
            if (pt.name.equalsIgnoreCase(ptype))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "TypeVO [name=" + name + ", primarytype=" + primarytype + ", select_entities=" + selectEntities + ", enum_entities=" + enumEntities + "]";
    }
}