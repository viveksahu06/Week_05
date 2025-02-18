package com.csvdatahandling.intermediateproblems.sortcsvrecord;

import java.util.Comparator;

// customize sorting is done here
class MyComparator implements Comparator<String[]> {
    @Override
    public int compare(String[] s1, String[] s2) {
        double salary1 = Double.parseDouble(s1[3]);
        double salary2 = Double.parseDouble(s2[3]);
        return Double.compare(salary1, salary2);
    }
}

