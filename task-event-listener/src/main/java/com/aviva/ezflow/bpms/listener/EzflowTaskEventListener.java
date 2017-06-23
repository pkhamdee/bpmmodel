package com.aviva.ezflow.bpms.listener;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.kie.api.task.TaskEvent;
import org.kie.api.task.TaskLifeCycleEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EzflowTaskEventListener implements TaskLifeCycleEventListener {

    private static Logger LOG = LoggerFactory.getLogger(EzflowTaskEventListener.class);

    public void beforeTaskActivatedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskClaimedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskSkippedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskStartedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskStoppedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskCompletedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskFailedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskAddedEvent(TaskEvent taskEvent) {
        if (LOG.isTraceEnabled()) {
            LOG.trace("## beforeTaskAddedEvent, taskId:{}, taskData:{}",
                    taskEvent.getTask().getId(),
                    ToStringBuilder.reflectionToString(taskEvent.getTask().getTaskData(), ToStringStyle.MULTI_LINE_STYLE));
        }
    }

    public void beforeTaskExitedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskReleasedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskResumedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskSuspendedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskForwardedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskDelegatedEvent(TaskEvent taskEvent) {

    }

    public void beforeTaskNominatedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskActivatedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskClaimedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskSkippedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskStartedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskStoppedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskCompletedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskFailedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskAddedEvent(TaskEvent taskEvent) {
        if (LOG.isTraceEnabled()) {
            LOG.trace("## afterTaskAddedEvent, taskId:{}, taskData:{}",
                    taskEvent.getTask().getId(),
                    ToStringBuilder.reflectionToString(taskEvent.getTask().getTaskData(), ToStringStyle.MULTI_LINE_STYLE));
        }
    }

    public void afterTaskExitedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskReleasedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskResumedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskSuspendedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskForwardedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskDelegatedEvent(TaskEvent taskEvent) {

    }

    public void afterTaskNominatedEvent(TaskEvent taskEvent) {

    }
}
