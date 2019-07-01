package com.aiub.worldcup2018androidsix.ModelClasses;

public class NotificationItem {

    private String flagUri;
    private String name;
    private boolean isNotified;
    //press ALT+Insert;


    public String getFlagUri() {
        return flagUri;
    }

    public void setFlagUri(String flagUri) {
        this.flagUri = flagUri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNotified() {
        return isNotified;
    }

    public void setNotified(boolean notified) {
        isNotified = notified;
    }

    public NotificationItem(String flagUri, String name, boolean isNotified) {

        this.flagUri = flagUri;
        this.name = name;
        this.isNotified = isNotified;
    }
}
