package com.ahmadsedi.bus;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 04/02/2025
 * Time: 18:51
 */

public class Bus {
    int start;
    int end;
    boolean redundant;

    public Bus(int[] bus) {
        this.start = bus[0];
        this.end = bus[1];
    }

    public boolean isRedundant() {
        return redundant;
    }

    public void setRedundant(boolean redundant) {
        this.redundant = redundant;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "[" + start +
                ", " + end +
                ']';
    }

    public boolean hasOverlap(Bus bus){
        if ((bus.getStart() >= this.getStart() && bus.getStart() <= this.getEnd()) ||
                (this.getStart() >= bus.getStart() && this.getStart() <= bus.getEnd())) {
            this.redundant = true;
            return true;
        }
        return false;
    }
}