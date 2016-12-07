package zhy2002.neutron;

/**
 * Base class for all config objects.
 * A UiNodeConfig object is used to provide instance specific
 * (as opposed to Class specific) logic for a UiNode.
 * If Multiple children of a ParentUiNode has the same class,
 * each one can have a different config identified by child name.
 */
public interface UiNodeConfig<N extends UiNode<?>> {

    String getName();

    void onAddedToParent(N node);

    void onLoaded(N node);


}
