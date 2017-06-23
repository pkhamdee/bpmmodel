package com.aviva.ezflow.bpms.handler;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmqWorkItemHandler implements WorkItemHandler {

    private static Logger LOG = LoggerFactory.getLogger(AmqWorkItemHandler.class);

    public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {

    }

    public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {

    }
}
