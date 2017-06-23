package com.aviva.ezflow.bpms.model;

/**
 * Created by kianhockting on 22/06/2017.
 */
public class ConcurrentDetails implements Serializable {

    String concurrentBatchId;
    String concurrentSequence;

    public ConcurrentDetails(String concurrentBatchId, String concurrentSequence) {
        this.concurrentBatchId = concurrentBatchId;
        this.concurrentSequence = concurrentSequence;
    }

    public String getConcurrentBatchId() {
        return concurrentBatchId;
    }

    public void setConcurrentBatchId(String concurrentBatchId) {
        this.concurrentBatchId = concurrentBatchId;
    }

    public String getConcurrentSequence() {
        return concurrentSequence;
    }

    public void setConcurrentSequence(String concurrentSequence) {
        this.concurrentSequence = concurrentSequence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConcurrentDetails)) return false;

        ConcurrentDetails that = (ConcurrentDetails) o;

        if (getConcurrentBatchId() != null ? !getConcurrentBatchId().equals(that.getConcurrentBatchId()) : that.getConcurrentBatchId() != null)
            return false;
        return getConcurrentSequence() != null ? getConcurrentSequence().equals(that.getConcurrentSequence()) : that.getConcurrentSequence() == null;
    }

    @Override
    public int hashCode() {
        int result = getConcurrentBatchId() != null ? getConcurrentBatchId().hashCode() : 0;
        result = 31 * result + (getConcurrentSequence() != null ? getConcurrentSequence().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "ConcurrentDetails{" +
                "concurrentBatchId='" + concurrentBatchId + '\'' +
                ", concurrentSequence='" + concurrentSequence + '\'' +
                '}';
    }
}
