package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;

@OtherLiabilityDescriptionNodeScope
public class OtherLiabilityDescriptionNodeRuleProvider implements RuleProvider<OtherLiabilityDescriptionNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityDescriptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityDescriptionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
