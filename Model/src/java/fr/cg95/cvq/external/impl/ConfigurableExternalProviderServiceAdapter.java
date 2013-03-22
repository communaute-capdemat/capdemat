package fr.cg95.cvq.external.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import fr.cg95.cvq.business.request.RequestState;
import fr.cg95.cvq.business.request.workflow.event.IWorkflowPostAction;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowArchivedEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowCancelledEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowClosedEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowCompleteEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowDraftEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowExtInProgressEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowGenericEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowInProgressEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowNotifiedEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowPendingEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowRectifiedEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowRejectedEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowUncompleteEvent;
import fr.cg95.cvq.business.request.workflow.event.impl.WorkflowValidatedEvent;
import fr.cg95.cvq.exception.CvqException;
import fr.cg95.cvq.external.ExternalServiceBean;
import fr.cg95.cvq.security.SecurityContext;
import fr.cg95.cvq.service.request.IRequestWorkflowService;

public abstract class ConfigurableExternalProviderServiceAdapter extends ExternalProviderServiceAdapter {

    private static Logger logger = Logger.getLogger(ExternalProviderServiceAdapter.class);

    private void maybeChangeState(final WorkflowGenericEvent wfEvent) {
        String rqt = wfEvent.getRequest().getRequestType().getLabel();
        ExternalServiceBean esb = SecurityContext.getCurrentConfigurationBean().getExternalServiceConfigurationBean().getBeanForExternalService(getLabel());

        String prop = (String)esb.getProperty(rqt + " ChangeState" + wfEvent.getClass().getSimpleName());
        if (prop != null) {
            final RequestState state = RequestState.forString(prop);
            if (prop.equals(state.toString())) {
                wfEvent.setWorkflowPostAction(new IWorkflowPostAction() {
                    @Override
                    public String getExecutor() {
                        return getLabel();
                    }

                    @Override
                    public void execute(IRequestWorkflowService requestWorkflowService) {
                        try {
                            requestWorkflowService.updateRequestState(wfEvent.getRequest().getId(), state, null);
                        } catch (CvqException e) {
                            logger.error(e.getMessage());
                        }
                    }
                });
            }
        }
    }

    private void maybeSendRequest(final WorkflowGenericEvent wfEvent) throws CvqException {
        String rqt = wfEvent.getRequest().getRequestType().getLabel();
        ExternalServiceBean esb = SecurityContext.getCurrentConfigurationBean().getExternalServiceConfigurationBean().getBeanForExternalService(getLabel());

        String prop = (String)esb.getProperty(rqt + " WSSend");
        String defaultprop = (String)esb.getProperty("Default WSSend");

        List<String> states = new ArrayList<String>();
        if (prop != null) {
            states = Arrays.asList(prop.trim().split(","));
        } else if (defaultprop != null) {
            states = Arrays.asList(defaultprop.trim().split(","));
        } else {
            states.add("WorkflowCompleteEvent");
        }

        if (states.contains(wfEvent.getClass().getSimpleName())) {
            checkExtReferentialAndSendRequest(wfEvent.getRequest());
        }
    }

    @Override
    public void visit(final WorkflowDraftEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowPendingEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowInProgressEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowExtInProgressEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowCompleteEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowUncompleteEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowRectifiedEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowCancelledEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowRejectedEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowValidatedEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowNotifiedEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowClosedEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

    @Override
    public void visit(final WorkflowArchivedEvent wfEvent) throws CvqException {
        maybeSendRequest(wfEvent);
        maybeChangeState(wfEvent);
    }

}
