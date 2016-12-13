/*
 Copyright (c) 2014 Jyrki Oraskari, Aalto University (jyrki [dot] oraskari [at] aalto [dot] fi)
 Copyright (c) 2014 Pieter Pauwels, Ghent University (modifications - pipauwel [dot] pauwels [at] ugent [dot] be / pipauwel [at] gmail [dot] com)
 Copyright (c) 2016 Lewis John McGibbney, Apache (mavenized - lewismc [at] apache [dot] org)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
 
 package org.buildingsmart.vo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IFCVO {

    private Long line_num;
    private String fullLineAfterNum;
    private String name = null;
    private LinkedList<Object> list = new LinkedList<Object>();
    private Map<String, LinkedList<IFCVO>> inverse_pointer_sets = new HashMap<String, LinkedList<IFCVO>>();

    public IFCVO() {
    }

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

    public Map<String, LinkedList<IFCVO>> getInverse_pointer_sets() {
        return inverse_pointer_sets;
    }

    public void setInverse_pointer_sets(Map<String, LinkedList<IFCVO>> inverse_pointer_sets) {
        this.inverse_pointer_sets = inverse_pointer_sets;
    }
}