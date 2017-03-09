package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@TrustTypeNodeScope
public class TrustTypeNodeRuleProvider implements RuleProvider<TrustTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public TrustTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustTypeNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.TRUST_TYPE.toArray());
    }

    @Inject
    Provider<TrustTypeChangedRule> trustTypeChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(trustTypeChangedRuleProvider.get());
    }

}
