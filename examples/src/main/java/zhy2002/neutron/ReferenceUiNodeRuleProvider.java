package zhy2002.neutron;

import dagger.MembersInjector;
import zhy2002.neutron.rule.NodeReferenceChangeRule;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Collections;
import java.util.List;

@Singleton
public class ReferenceUiNodeRuleProvider implements RuleProvider<ReferenceUiNode<?>> {

    @Inject
    public ReferenceUiNodeRuleProvider() {
    }

    @Inject
    MembersInjector<NodeReferenceChangeRule> injector;

    @Override
    public List<UiNodeRule<ReferenceUiNode<?>>> createRules(ReferenceUiNode<?> node) {
        NodeReferenceChangeRule rule = new NodeReferenceChangeRule(node);
        injector.injectMembers(rule);
        return Collections.singletonList(
                rule
        );
    }
}
