package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustTypeNode;


@TrustTypeNodeScope
public class TrustTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<TrustTypeNode> {

    @Inject
    public TrustTypeNodeRuleProvider() {}

    @Override
    public void initializeState(TrustTypeNode node) {
    }


    @Inject
    Provider<TrustTypeChangedRule> trustTypeChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(trustTypeChangedRuleProvider.get());
    }

}
