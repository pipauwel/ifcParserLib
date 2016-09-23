/*
The GNU Affero General Public License

Copyright (c) 2014 Pieter Pauwels (pipauwel.pauwels@ugent.be / pipauwel@gmail.com)

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

public class NamedIndividualVO {
	
	private String enumName;
	private String namedIndividual;
	private String originalNameOfIndividual;

	public NamedIndividualVO() {
		// UNUSED
	}

	public NamedIndividualVO(String enumName, String namedIndividual) {
		this.enumName = enumName;
		this.namedIndividual = namedIndividual;
		this.originalNameOfIndividual = namedIndividual;
	}
	public NamedIndividualVO(String enumName, String namedIndividual, String originalName) {
		this(enumName,namedIndividual);
		this.originalNameOfIndividual = originalName;
	}

	/**
	 * @return the enumName
	 */
	public String getEnumName() {
		return enumName;
	}

	/**
	 * @param enumName the enumName to set
	 */
	public void setEnumName(String enumName) {
		this.enumName = enumName;
	}

	/**
	 * @return the namedIndividual
	 */
	public String getNamedIndividual() {
		return namedIndividual;
	}

	/**
	 * @param namedIndividual the namedIndividual to set
	 */
	public void setNamedIndividual(String namedIndividual) {
		this.namedIndividual = namedIndividual;
	}

	/**
	 * @return the originalNameOfIndividual
	 */
	public String getOriginalNameOfIndividual() {
		return originalNameOfIndividual;
	}

	/**
	 * @param originalNameOfIndividual the originalNameOfIndividual to set
	 */
	public void setOriginalNameOfIndividual(String originalNameOfIndividual) {
		this.originalNameOfIndividual = originalNameOfIndividual;
	}

}
