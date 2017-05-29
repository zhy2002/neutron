package zhy2002.examples;

import zhy2002.neutron.UiNodeChangeListener;

public class CountingChangeListener implements UiNodeChangeListener {
    private int count = 0;

    @Override
    public void onUiNodeChanged() {
        count++;
    }

    public int getCount() {
        return count;
    }
}