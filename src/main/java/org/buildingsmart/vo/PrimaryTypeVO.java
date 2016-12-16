package org.buildingsmart.vo;

import java.util.ArrayList;
import java.util.List;

public class PrimaryTypeVO {

    private String pTypeName;
    private static List<PrimaryTypeVO> listOfPrimaryTypes = new ArrayList<>();
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

    public static PrimaryTypeVO getPrimaryTypeVO(String pTypeName) {
        if (pTypeName.endsWith(";"))
            pTypeName = pTypeName.substring(0, pTypeName.length() - 1);
        for (PrimaryTypeVO pt : listOfPrimaryTypes) {
            if (pt.pTypeName.equalsIgnoreCase(pTypeName))
                return pt;
        }
        return null;
    }

    public List<TypeVO> getParentSelect() {
        return parentSelect;
    }

    public void addParentSelectType(TypeVO parentSelect) {
        if (this.parentSelect == null)
            this.parentSelect = new ArrayList<>();
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
        if ("REAL".equalsIgnoreCase(pTypeName) || "NUMBER".equalsIgnoreCase(pTypeName))
            return "double";
        else if ("BINARY".equalsIgnoreCase(pTypeName))
            return "hexBinary";
        else if ("INTEGER".equalsIgnoreCase(pTypeName))
            return "integer";
        else if ("STRING".equalsIgnoreCase(pTypeName))
            return "string";
        else if ("BOOLEAN".equalsIgnoreCase(pTypeName) || "LOGICAL".equalsIgnoreCase(pTypeName))
            return "boolean";
        return "XSDTYPE";
    }

    public String getJAVAType() {
        if ("REAL".equalsIgnoreCase(pTypeName) || "NUMBER".equalsIgnoreCase(pTypeName))
            return "Double";
        else if ("BINARY".equalsIgnoreCase(pTypeName))
            return "org.apache.axis2.databinding.types.xsd.HexBinary";
        else if ("INTEGER".equalsIgnoreCase(pTypeName))
            return "Integer";
        else if ("STRING".equalsIgnoreCase(pTypeName))
            return "String";
        else if ("BOOLEAN".equalsIgnoreCase(pTypeName) || "LOGICAL".equalsIgnoreCase(pTypeName))
            return "Boolean";
        return "JAVAType";
    }
}
