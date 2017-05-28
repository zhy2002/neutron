package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.TrustIndustryNode;
import zhy2002.examples.lodgement.gen.di.*;

@TrustIndustryNodeScope
public class TrustIndustryNodeRuleProvider implements RuleProvider<TrustIndustryNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public TrustIndustryNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustIndustryNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
