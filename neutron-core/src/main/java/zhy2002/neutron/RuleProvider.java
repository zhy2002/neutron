package zhy2002.neutron;

import java.util.List;

/**
 * Implement this interface to provide initial state and rules to a node.
 * Rule provider of a concrete node class is scoped to that node class's component.
 * Rule provider of an abstract node class is un-scoped.
 * A rule provider instance must know the owner node instance.
 */
public interface RuleProvider<N extends UiNode<?>> {

    void initializeState(N node);

    void createRules(List<UiNodeRule<?>> createdRules);

}
