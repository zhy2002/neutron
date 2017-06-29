package zhy2002.neutron.test;

import zhy2002.neutron.UiNodeChangeListener;

public class CountingChangeListener extends UiNodeChangeListener {
    private int count = 0;

    @Override
    public void onUiNodeChanged() {
        count++;
    }

    public int getCount() {
        return count;
    }
}