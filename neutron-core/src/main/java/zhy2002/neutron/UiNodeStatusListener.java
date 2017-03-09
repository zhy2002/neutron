package zhy2002.neutron;

import java.util.List;

interface UiNodeStatusListener {

    /**
     * Called when rules are created.
     * You can still add rules to the list if required.
     * @param createdRules the created rules.
     */
    void postCreateRules(List<UiNodeRule<?>> createdRules);

    void exitAddToParent();

    void exitLoad();
}
