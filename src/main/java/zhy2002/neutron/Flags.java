package zhy2002.neutron;

/**
 * Created by john.zhang on 17/11/2016.
 */
public abstract class Flags {

    private int storage;

    protected void setFlag(int index, boolean value) {
        int mask = 1 << index;
        if (value) {
            storage |= mask;
        } else {
            storage &= ~mask;
        }
    }

    protected boolean getFlag(int index) {
        int mask = 1 << index;
        return (storage & mask) != 0;
    }
}
