package edu.cscc.topics.quality.unit;

public class SimpleJoiner implements Joiner{

    public String join(String separator, String base, String... parts) {
        String accumulation = base;
        for (int i = 0; i < parts.length; i++) {
            accumulation = accumulation + separator + parts[i];
        }
        return accumulation;
    }
}
