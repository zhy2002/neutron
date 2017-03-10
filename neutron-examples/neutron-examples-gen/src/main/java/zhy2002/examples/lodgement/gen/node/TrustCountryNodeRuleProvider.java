package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

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

        node.setRequired(true);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
