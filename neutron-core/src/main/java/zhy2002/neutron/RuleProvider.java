package zhy2002.neutron;

import javax.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Implement this interface to provide initial state and rules to a node.
 * Rule provider of a concrete node class is scoped to that node class's component.
 * Rule provider of an abstract node class is un-scoped.
 * A rule provider instance must know the owner node instance.
 */
public interface RuleProvider<N extends UiNode<?>> {

    void initializeState(N node);

    void createRules(List<UiNodeRule<?>> createdRules);

    static <N extends UiNode<?>> List<RuleProvider<N>> extractRuleProviders(
            String[] potentialRuleProviderKeys,
            Map<String, Provider<RuleProvider<N>>> ruleProviderProviderMap
    ) {
        List<RuleProvider<N>> ruleProviders = new ArrayList<>();
        for (String key : potentialRuleProviderKeys) {
            Provider<RuleProvider<N>> provider = ruleProviderProviderMap.get(key);
            if (provider != null) {
                ruleProviders.add(provider.get());
            }
        }
        return ruleProviders;
    }

}
