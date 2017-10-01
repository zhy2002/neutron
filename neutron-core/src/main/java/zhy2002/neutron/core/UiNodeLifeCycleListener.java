package zhy2002.neutron.core;

import java.util.List;

/**
 * Implement this interface if interested in the life cycle phases of a UiNode.
 */
interface UiNodeLifeCycleListener {

    /**
     * Called when rules are created.
     * You can still add rules to the list if required.
     * @param createdRules the created rules.
     */
    void postCreateRules(List<UiNodeRule<?>> createdRules);

    void exitAddToParent();

    void exitLoad();
}
