package com.averageasians.methacks.entity.summarize;

import com.averageasians.methacks.entity.meta.Meta;

public class SummarizeOutput {
    private String id;
    private String summary;
    private Meta meta;

    public SummarizeOutput() {}
    public SummarizeOutput(String id, String summary, Meta meta){
        this.id = id;
        this.summary = summary;
        this.meta = meta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
