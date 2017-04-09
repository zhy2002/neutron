package zhy2002.neutron;

import java.util.List;

/**
 * Helper class so you don't need to override every method in UiNodeLifeCycleListener.
 */
public class NopUiNodeLifeCycleListener implements UiNodeLifeCycleListener {
    @Override
    public void postCreateRules(List<UiNodeRule<?>> createdRules) {

    }

    @Override
    public void exitAddToParent() {

    }

    @Override
    public void exitLoad() {

    }
}
