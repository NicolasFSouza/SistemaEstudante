package com.estudante.SistemaEstudante.model;

import java.time.LocalDateTime;

public class InfoModel {
    private String applicationName;
    private LocalDateTime time;
    private String javaVersion;
    private String status;

    public InfoModel(String applicationName, LocalDateTime time, String javaVersion, String status) {
        this.applicationName = applicationName;
        this.time = time;
        this.javaVersion = javaVersion;
        this.status = status;
    }

    public InfoModel() {}

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public void setJavaVersion(String javaVersion) {
        this.javaVersion = javaVersion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
