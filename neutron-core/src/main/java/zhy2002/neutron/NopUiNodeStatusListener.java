package zhy2002.neutron;

import java.util.List;

/**
 * Helper class so you don't need to override every method in UiNodeStatusListener.
 */
public class NopUiNodeStatusListener implements UiNodeStatusListener {
    @Override
    public void postCreateRules(List<UiNodeRule<?>> createdRules) {

    }

    @Override
    public void postAddToParent() {

    }

    @Override
    public void postLoad() {

    }
}
