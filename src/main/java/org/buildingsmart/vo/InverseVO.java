/*
The GNU Affero General Public License

Copyright (c) 2014 Jyrki Oraskari
Copyright (c) 2014 Pieter Pauwels  (modifications - pipauwel.pauwels@ugent.be / pipauwel@gmail.com)

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

public class InverseVO implements Serializable {
    private static final long serialVersionUID = -6700903862493542784L;
    private String name;
    private String classRange;
    private String inverseOfProperty;
    private boolean set = false;
    private boolean unique = false;
    private int minCard = -1;
    private int maxCard = -1;
    private PropertyVO associatedProperty = null;

    public InverseVO(String name, String classRange, String inverseOfProperty, boolean set, int minCard, int maxCard) {
        super();
        this.name = name;
        this.classRange = classRange;
        this.inverseOfProperty = inverseOfProperty;
        this.set = set;
        this.minCard = minCard;
        this.maxCard = maxCard;
    }

    public boolean isSet() {
        return set;
    }

    public void setSet(boolean set) {
        this.set = set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassRange() {
        return classRange;
    }

    public void setClassRange(String classRange) {
        this.classRange = classRange;
    }

    public String getInverseOfProperty() {
        return inverseOfProperty;
    }

    public void setInverseOfProperty(String inverseOfProperty) {
        this.inverseOfProperty = inverseOfProperty;
    }

    public boolean isUnique() {
        return unique;
    }

    public void setUnique(boolean unique) {
        this.unique = unique;
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

    public PropertyVO getAssociatedProperty() {
        return associatedProperty;
    }

    public void setAssociatedProperty(PropertyVO associatedProperty) {
        this.associatedProperty = associatedProperty;
    }

    @Override
    public String toString() {
        return "InverseVO [name=" + name + ", classRange=" + classRange + ", inverseOfProperty=" + inverseOfProperty + ", set=" + set + "]";
    }
}
