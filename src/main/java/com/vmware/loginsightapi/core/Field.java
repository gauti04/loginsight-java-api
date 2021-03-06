/**
 * Copyright © 2016 VMware, Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the “License”); you may not 
 * use this file except in compliance with the License. You may obtain a copy of 
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 * Some files may be comprised of various open source software components, each of which
 * has its own license that is located in the source code of the respective component.
 */
package com.vmware.loginsightapi.core;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Class representing individual field in the LogInsight messages.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Field {
	private String name;
	private String content;
	private String startPosition;
	private String length;

	/**
	 * Default constructor
	 */
	public Field() {

	}

	/**
	 * Initialize the Field object with name and content
	 * 
	 * @param name
	 *            name of the field
	 * @param content
	 *            content/value of the field.
	 */
	public Field(String name, String content) {
		this.name = name;
		this.content = content;
	}

	/**
	 * Initializes the Field object with name, startPosition and length
	 * 
	 * @param name
	 *            name of the field
	 * @param startPosition
	 *            start position in the message text (servers as offset for
	 *            picking the field content)
	 * @param length
	 *            length of the field content
	 */
	public Field(String name, String startPosition, String length) {
		this.name = name;
		this.startPosition = startPosition;
		this.length = length;
	}

	/**
	 * Initializes the Field object with all the attributes
	 * 
	 * @param name
	 *            name of the field
	 * @param content
	 *            content of the field
	 * @param startPosition
	 *            start position in the message text (servers as offset for
	 *            picking the field content)
	 * @param length
	 *            length of the field content
	 */
	public Field(String name, String content, String startPosition, String length) {
		this.name = name;
		this.content = content;
		this.startPosition = startPosition;
		this.length = length;
	}

	/**
	 * Getter for name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for content
	 * 
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Setter for content
	 * 
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Getter for startPosition
	 * 
	 * @return the startPosition
	 */
	public String getStartPosition() {
		return startPosition;
	}

	/**
	 * Setter for startPosition
	 * 
	 * @param startPosition
	 *            the startPosition to set
	 */
	public void setStartPosition(String startPosition) {
		this.startPosition = startPosition;
	}

	/**
	 * Getter for length
	 * 
	 * @return the length
	 */
	public String getLength() {
		return length;
	}

	/**
	 * Setter for length
	 * 
	 * @param length
	 *            the length to set
	 */
	public void setLength(String length) {
		this.length = length;
	}
}
