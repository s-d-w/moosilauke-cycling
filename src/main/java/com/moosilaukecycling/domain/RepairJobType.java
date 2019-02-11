package com.moosilaukecycling.domain;

public enum RepairJobType {

    BRAKES("brakes"),
    BOTTOMBRACKET("bottom bracket"),
    TUNEUP("tuneup");

    private String type;

    RepairJobType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
