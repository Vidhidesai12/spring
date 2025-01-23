package com.getarrayz.securedoc.enumeration;

public enum Authority {
    USER(""),
    Admin(""),
    SUPER_ADMIN(""),
    MANAGER("");

    private final String value;

    Authority(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
