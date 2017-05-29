package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.TrustCountryNode;
import zhy2002.examples.lodgement.gen.di.*;

@TrustCountryNodeScope
public class TrustCountryNodeRuleProvider implements RuleProvider<TrustCountryNode> {

    @Inject
    BaseCountryNodeRuleProvider parentRuleProvider;

    @Inject
    public TrustCountryNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustCountryNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}