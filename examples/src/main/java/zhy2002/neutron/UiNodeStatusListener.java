package zhy2002.neutron;

import java.util.List;

public interface UiNodeStatusListener {

    /**
     * Called when rules are created.
     * You can still add rules to the list if required.
     * @param createdRules the created rules.
     */
    void onCreatedRules(List<UiNodeRule<?>> createdRules);

    void onAddedToParent();

    void onLoaded();
}
