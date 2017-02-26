package zhy2002.neutron;

import java.util.List;

/**
 * Implement this interface to provide rules to a node.
 */
public interface RuleProvider<N extends UiNode<?>> {

    void initializeState(N node);

    void createRules(List<UiNodeRule<?>> createdRules);

}
