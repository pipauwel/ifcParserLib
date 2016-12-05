package org.buildingsmart.vo;

import java.util.ArrayList;
import java.util.List;

public class PrimaryTypeVO {

    private String pTypeName;
    private static List<PrimaryTypeVO> listOfPrimaryTypes = new ArrayList<PrimaryTypeVO>();
    private List<TypeVO> parentSelect;

    public PrimaryTypeVO() {
        // unused
    }

    public PrimaryTypeVO(String pTypeName) {
        if (pTypeName.endsWith(";"))
            pTypeName = pTypeName.substring(0, pTypeName.length() - 1);
        if (getPrimaryTypeVO(pTypeName) == null) {
            this.pTypeName = pTypeName;
            listOfPrimaryTypes.add(this);
        }
    }

    public static PrimaryTypeVO getPrimaryTypeVO(String PTypeName) {
        if (PTypeName.endsWith(";"))
            PTypeName = PTypeName.substring(0, PTypeName.length() - 1);
        for (PrimaryTypeVO pt : listOfPrimaryTypes) {
            if (pt.pTypeName.equalsIgnoreCase(PTypeName))
                return pt;
        }
        return null;
    }

    public List<TypeVO> getParentSelect() {
        return parentSelect;
    }

    public void addParentSelectType(TypeVO parentSelect) {
        if (this.parentSelect == null)
            this.parentSelect = new ArrayList<TypeVO>();
        this.parentSelect.add(parentSelect);
    }

    public String getPTypeName() {
        return pTypeName;
    }

    public static List<PrimaryTypeVO> getListOfPrimaryTypes() {
        return listOfPrimaryTypes;
    }

    public static boolean checkIfPType(String ptype) {
        for (PrimaryTypeVO pt : listOfPrimaryTypes) {
            if (pt.pTypeName.equalsIgnoreCase(ptype))
                return true;
        }
        return false;
    }

    public static PrimaryTypeVO getClosestResemblance(String ptype) {
        for (PrimaryTypeVO pt : listOfPrimaryTypes) {
            if (ptype.contains(pt.pTypeName))
                return pt;
        }
        return null;
    }

    public int getAdditionalRestriction(String ptype) {
        String temp = this.pTypeName;
        return Integer.parseInt(ptype.replaceAll(temp, ""));
    }

    public String getXSDType() {
        if (pTypeName.equalsIgnoreCase("REAL"))
            return "double";
        else if (pTypeName.equalsIgnoreCase("BINARY"))
            return "hexBinary";
        else if (pTypeName.equalsIgnoreCase("INTEGER"))
            return "integer";
        else if (pTypeName.equalsIgnoreCase("NUMBER"))
            return "double";
        else if (pTypeName.equalsIgnoreCase("STRING"))
            return "string";
        else if (pTypeName.equalsIgnoreCase("BOOLEAN"))
            return "boolean";
        else if (pTypeName.equalsIgnoreCase("LOGICAL"))
            return "boolean";
        return "XSDTYPE";
    }

    public String getJAVAType() {
        if (pTypeName.equalsIgnoreCase("REAL"))
            return "Double";
        else if (pTypeName.equalsIgnoreCase("BINARY"))
            return "org.apache.axis2.databinding.types.xsd.HexBinary";
        else if (pTypeName.equalsIgnoreCase("INTEGER"))
            return "Integer";
        else if (pTypeName.equalsIgnoreCase("NUMBER"))
            return "Double";
        else if (pTypeName.equalsIgnoreCase("STRING"))
            return "String";
        else if (pTypeName.equalsIgnoreCase("BOOLEAN"))
            return "Boolean";
        else if (pTypeName.equalsIgnoreCase("LOGICAL"))
            return "Boolean";
        return "JAVAType";
    }
}
