/*
 * Certain versions of software and/or documents ("Material") accessible here may contain branding from
 * Hewlett-Packard Company (now HP Inc.) and Hewlett Packard Enterprise Company.  As of September 1, 2017,
 * the Material is now offered by Micro Focus, a separately owned and operated company.  Any reference to the HP
 * and Hewlett Packard Enterprise/HPE marks is historical in nature, and the HP and Hewlett Packard Enterprise/HPE
 * marks are the property of their respective owners.
 * __________________________________________________________________
 * MIT License
 *
 * (c) Copyright 2012-2019 Micro Focus or one of its affiliates.
 *
 * The only warranties for products and services of Micro Focus and its affiliates
 * and licensors ("Micro Focus") are set forth in the express warranty statements
 * accompanying such products and services. Nothing herein should be construed as
 * constituting an additional warranty. Micro Focus shall not be liable for technical
 * or editorial errors or omissions contained herein.
 * The information contained herein is subject to change without notice.
 * ___________________________________________________________________
 */

package com.microfocus.application.automation.tools.results.service.almentities;

public interface IAlmConsts {

	public enum IStatuses {
		NO_RUN("No Run"),
		PASSED("Passed"),
		FAILED("Failed"),
		BLOCKED("Blocked"),
		NOT_COMPLETED("Not Completed");

		private String value;

		IStatuses(String value) {
			this.value = value;
		}

		public String value() {
			return value;
		}
	}

	public final String IMPORT_RUN_NAME_TEMPLATE = "Import_Run_%d-%d_%d-%d-%d";
}
