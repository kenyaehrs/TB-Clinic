package org.openmrs.module.tbclinic.page.controller;

import org.openmrs.Concept;
import org.openmrs.ConceptAnswer;
import org.openmrs.api.context.Context;
import org.openmrs.module.hospitalcore.PatientQueueService;
import org.openmrs.module.hospitalcore.model.OpdPatientQueue;
import org.openmrs.module.hospitalcore.model.TriagePatientQueue;
import org.openmrs.ui.framework.SimpleObject;
import org.openmrs.ui.framework.UiUtils;
import org.openmrs.ui.framework.page.PageModel;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author  ngarivictor
 * Created on 1/14/2016.
 *
 */
public class HomePageController {

    /**
     * Default handler for POST and GET requests if none is provided
     */

        private static int TB_CLINIC = 5118;

        public void get(PageModel model, UiUtils ui) {
            List<OpdPatientQueue> patientQueues = Context.getService(PatientQueueService.class).listOpdPatientQueue("", TB_CLINIC = 5118, "", 0, 0);
            model.addAttribute("tbQueue", patientQueues);
        }
    }


