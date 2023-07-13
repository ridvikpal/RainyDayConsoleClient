package org.rainyday;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Alert {
    ArrayList<AlertSubClass> alert;
    static private class AlertSubClass{
        private String headline, msgtype, severity, urgency, areas, category, certainty, event, note
                , effective, expires, desc, instruction;

        public String getHeadline() {
            return headline;
        }

        public String getMsgtype() {
            return msgtype;
        }

        public String getSeverity() {
            return severity;
        }

        public String getUrgency() {
            return urgency;
        }

        public String getAreas() {
            return areas;
        }

        public String getCategory() {
            return category;
        }

        public String getCertainty() {
            return certainty;
        }

        public String getEvent() {
            return event;
        }

        public String getNote() {
            return note;
        }

        public String getEffective() {
            return effective;
        }

        public String getExpires() {
            return expires;
        }

        public String getDesc() {
            return desc;
        }

        public String getInstruction() {
            return instruction;
        }

        @Override
        public String toString(){
            return new StringJoiner("\n\t\t\t", "(\n\t\t\t", "\n\t\t\t)")
                    .add("headline=" + this.getHeadline())
                    .add("msgtype=" + this.getMsgtype())
                    .add("severity=" + this.getSeverity())
                    .add("urgency=" + this.getUrgency())
                    .add("areas=" + this.getAreas())
                    .add("category=" + this.getCategory())
                    .add("certainty=" + this.getCertainty())
                    .add("event=" + this.getEvent())
                    .add("note=" + this.getNote())
                    .add("effective=" + this.getEffective())
                    .add("expires=" + this.getExpires())
                    .add("desc=" + this.getExpires())
                    .add("instruction=" + this.getInstruction())
                    .toString();
        }
    }

    @Override
    public String toString(){
        String result = null;
        for (AlertSubClass x : alert){
            result += new StringJoiner("\n\t\t", "[\n\t\t", " \n\t\t]")
                .add("alert=" + x)
                .toString();
        }
        return result;
    }
}
