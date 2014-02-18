/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.kenyaemr.reporting.cohort.definition;


import org.openmrs.Concept;
import org.openmrs.module.reporting.cohort.definition.BaseCohortDefinition;
import org.openmrs.module.reporting.definition.configuration.ConfigurationProperty;

import java.util.Date;
import java.util.List;

/**
 * Cohort definition based on patient drug orders
 */

public class DrugOrdersCohortDefinition extends BaseCohortDefinition {

	@ConfigurationProperty(required = false, group = "date range")
	private Date onOrAfter;

	@ConfigurationProperty(required = false, group = "date range")
	private Date onOrBefore;

	@ConfigurationProperty(group = "conceptsToInclude")
	private List<Concept> conceptList;

	public DrugOrdersCohortDefinition() {

	}
	public DrugOrdersCohortDefinition(List<Concept> conceptList) {
		 this.conceptList = conceptList;
	}

	public Date getOnOrBefore() {
		return onOrBefore;
	}

	public Date getOnOrAfter() {
		return onOrAfter;
	}

	public List<Concept> getConceptList() {
		return conceptList;
	}

	public void setOnOrAfter(Date onOrAfter) {
		this.onOrAfter = onOrAfter;
	}

	public void setOnOrBefore(Date onOrBefore) {
		this.onOrBefore = onOrBefore;
	}

	public void setConceptList(List<Concept> conceptList) {
		this.conceptList = conceptList;
	}

}
