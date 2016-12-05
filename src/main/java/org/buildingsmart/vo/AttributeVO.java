package org.buildingsmart.vo;

import java.io.Serializable;

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

public class AttributeVO implements Serializable {
    private static final long serialVersionUID = -7269719435899663513L;
    private String name;
    private String originalName;
    private EntityVO domain;
    private String rangeNS;

    private boolean array = false;
    private boolean set = false;
    private boolean list = false;
    private int minCard = -1;
    private int maxCard = -1;
    private boolean optional = false;

    private boolean listOfList = false;
    private int minCard_listoflist = -1;
    private int maxCard_listoflist = -1;

    private TypeVO type;
    boolean unique = false;
    private boolean reverse_pointer; // defined in another class
    boolean isOne2One = false;

    private InverseVO points_from;

    public AttributeVO(String name, TypeVO type, boolean is_array, boolean is_set, boolean is_list, boolean is_listoflist, int minCard, int maxCard, int tmp_listoflist_mincard,
                    int tmp_listoflist_maxcard, boolean is_optional) {
        super();
        this.name = name;
        this.type = type;
        this.reverse_pointer = false;
        this.array = is_array;
        this.set = is_set;
        this.list = is_list;
        this.setMinCard(minCard);
        this.setMaxCard(maxCard);
        this.setOptional(is_optional);
        this.setListOfList(is_listoflist);
        this.setMinCard_listoflist(tmp_listoflist_mincard);
        this.setMaxCard_listoflist(tmp_listoflist_maxcard);
    }

    public boolean isArray() {
        return array;
    }

    public void setArray(boolean array) {
        this.set = array;
    }

    public boolean isSet() {
        return set;
    }

    public void setSet(boolean set) {
        this.set = set;
    }

    public boolean isList() {
        return list;
    }

    public void setList(boolean list) {
        this.list = list;
    }

    public boolean isListOfList() {
        return listOfList;
    }

    public void setListOfList(boolean listOfList) {
        this.listOfList = listOfList;
    }

    public int getMinCard() {
        return minCard;
    }

    public void setMinCard(int minCard) {
        this.minCard = minCard;
    }

    public int getMaxCard() {
        return maxCard;
    }

    public void setMaxCard(int maxCard) {
        this.maxCard = maxCard;
    }

    public int getMinCard_listoflist() {
        return minCard_listoflist;
    }

    public void setMinCard_listoflist(int minCard_listoflist) {
        this.minCard_listoflist = minCard_listoflist;
    }

    public int getMaxCard_listoflist() {
        return maxCard_listoflist;
    }

    public void setMaxCard_listoflist(int maxCard_listoflist) {
        this.maxCard_listoflist = maxCard_listoflist;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLowerCaseName() {
        return Character.toLowerCase(name.charAt(0)) + name.substring(1);
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public TypeVO getType() {
        return type;
    }

    public void setType(TypeVO type) {
        this.type = type;
    }

    public boolean isReverse_pointer() {
        return reverse_pointer;
    }

    public void setReverse_pointer(boolean reverse_pointer) {
        this.reverse_pointer = reverse_pointer;
    }

    public InverseVO getPoints_from() {
        return points_from;
    }

    public void setPoints_from(InverseVO points_from) {
        this.points_from = points_from;
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
    }

    public boolean isOne2One() {
        return isOne2One;
    }

    public void setOne2One(boolean isOne2One) {
        this.isOne2One = isOne2One;
    }

    public EntityVO getDomain() {
        return domain;
    }

    public void setDomain(EntityVO domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "AttributeVO [name=" + name + ", type=" + type + ", reverse_pointer=" + reverse_pointer + ", points_from=" + points_from + ", set=" + set + "]";
    }

    public String getRangeNS() {
        return rangeNS;
    }

    public void setRangeNS(String rangeNS) {
        this.rangeNS = rangeNS;
    }
}
