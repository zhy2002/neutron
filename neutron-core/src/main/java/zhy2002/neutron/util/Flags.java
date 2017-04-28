package zhy2002.neutron.util;

/**
 * A utility class to help define bit flags.
 */
public final class Flags {

    private int storage;

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setFlag(int index, boolean value) {
        assert index >= 0 && index < 32;

        int mask = 1 << index;
        if (value) {
            storage |= mask;
        } else {
            storage &= ~mask;
        }
    }

    public boolean getFlag(int index) {
        assert index >= 0 && index < 32;

        int mask = 1 << index;
        return (storage & mask) != 0;
    }
}
