package com.averageasians.methacks.entity.summarize;
public class SummarizeInput {

    private String text;
    private String length;
    private String format;
    private String model;
    private String extractiveness;
    private float temperature;
    private String additional_command;

    public SummarizeInput() {}

    public SummarizeInput(String text, String length, String format, String model, String extractiveness, float temperature, String additional_command){
        this.text = text;
        this.length = length;
        this.format = format;
        this.model = model;
        this.extractiveness = extractiveness;
        this.temperature = temperature;
        this.additional_command = additional_command;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getExtractiveness() {
        return extractiveness;
    }

    public void setExtractiveness(String extractiveness) {
        this.extractiveness = extractiveness;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getAdditional_command() {
        return additional_command;
    }

    public void setAdditional_command(String additional_command) {
        this.additional_command = additional_command;
    }
}


