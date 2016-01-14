package org.openmrs.module.tbclinic.extension.html;

import org.openmrs.module.web.extension.LinkExt;

public class TBClinicHeader extends LinkExt {

	@Override
	public String getLabel() {
		return "tbclinic.title";
	}

	@Override
	public String getRequiredPrivilege() {
		return "Doctor";
	}

	@Override
	public String getUrl() {
		return "tbclinic/tbhome.page";
	}

}
