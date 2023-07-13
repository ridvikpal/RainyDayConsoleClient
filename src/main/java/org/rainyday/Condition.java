package org.rainyday;

import java.util.StringJoiner;

public class Condition{
    private String text, icon;
    private int code;

    // GETTERS AND SETTERS
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    // toString method overloading
    public String toString(){
        return new StringJoiner("\n\t\t\t", "(\n\t\t\t", "\n\t\t\t)")
                .add("text=" + this.getText())
                .add("icon=" + this.getIcon())
                .add("code=" + this.getCode())
                .toString();
    }
}