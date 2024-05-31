package org.example;

public class StaticXmpl {

    static int totalCount;
    private int instanceCount;

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "StaticXmpl{" +
                "instanceCount=" + instanceCount +
                ", totalCount=" + totalCount +
                '}';
    }
}
