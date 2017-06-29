package com.aviva.ezflow.bpms.model;

import java.io.Serializable;

/**
 * Created by kianhockting on 22/06/2017.
 */
public class ConcurrentDetails implements Serializable {

    private String concurrentBatchId;
    private int concurrentSequence;
    private int concurrentTotal;

    public ConcurrentDetails() {
    }

    public ConcurrentDetails(String concurrentBatchId, int concurrentSequence, int concurrentTotal) {
        this.concurrentBatchId = concurrentBatchId;
        this.concurrentSequence = concurrentSequence;
        this.concurrentTotal = concurrentTotal;
    }

    public String getConcurrentBatchId() {
        return concurrentBatchId;
    }

    public void setConcurrentBatchId(String concurrentBatchId) {
        this.concurrentBatchId = concurrentBatchId;
    }

    public int getConcurrentSequence() {
        return concurrentSequence;
    }

    public void setConcurrentSequence(int concurrentSequence) {
        this.concurrentSequence = concurrentSequence;
    }

    public int getConcurrentTotal() {
        return concurrentTotal;
    }

    public void setConcurrentTotal(int concurrentTotal) {
        this.concurrentTotal = concurrentTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConcurrentDetails)) return false;

        ConcurrentDetails that = (ConcurrentDetails) o;

        if (getConcurrentSequence() != that.getConcurrentSequence()) return false;
        if (getConcurrentTotal() != that.getConcurrentTotal()) return false;
        return getConcurrentBatchId() != null ? getConcurrentBatchId().equals(that.getConcurrentBatchId()) : that.getConcurrentBatchId() == null;
    }

    @Override
    public int hashCode() {
        int result = getConcurrentBatchId() != null ? getConcurrentBatchId().hashCode() : 0;
        result = 31 * result + getConcurrentSequence();
        result = 31 * result + getConcurrentTotal();
        return result;
    }

    @Override
    public String toString() {
        return "ConcurrentDetails{" +
                "concurrentBatchId='" + concurrentBatchId + '\'' +
                ", concurrentSequence=" + concurrentSequence +
                ", concurrentTotal=" + concurrentTotal +
                '}';
    }
}
