package com.hp.octane.plugins.jenkins.model.events;

/**
 * Created with IntelliJ IDEA.
 * User: gullery
 * Date: 20/10/14
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 */

public enum CIEventType {
	QUEUED("queued"),
	STARTED("started"),
	FINISHED("finished");

	private String value;

	private CIEventType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	public static CIEventType getByValue(String value) {
		CIEventType r = null;
		for (CIEventType v : values()) {
			if (v.value.compareTo(value) == 0) {
				r = v;
				break;
			}
		}
		return r;
	}
}
