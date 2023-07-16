package org.rainyday;

import java.util.StringJoiner;

public class Astronomy{
    private Astro astro;

    public Astro getAstro() {
        return astro;
    }

    @Override
    public String toString(){
        return new StringJoiner("\n\t\t", "[\n\t\t", " \n\t\t]")
            .add("astro=" + this.getAstro())
            .toString();
    }
}