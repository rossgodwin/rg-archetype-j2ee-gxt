package org.rg.archetype.gxt.app.shared;

import java.io.Serializable;

public class WelcomeReplyRequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
