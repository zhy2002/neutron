package zhy2002.neutron;

import java.util.List;

/**
 * Base class for all config objects.
 * A UiNodeConfig object is used to provide instance specific
 * (as opposed to Class specific) logic for a UiNode.
 * If Multiple children of a ParentUiNode has the same class,
 * each one can have a different config identified by child name.
 */
public abstract class UiNodeConfig<N extends UiNode<?>> {

    public abstract String getName();

    public void onAddedToParent(N node) {}

    public void onCreatedRules(N node, List<UiNodeRule<?>> createdRules) {}

    public void onLoaded(N node) {}

}
