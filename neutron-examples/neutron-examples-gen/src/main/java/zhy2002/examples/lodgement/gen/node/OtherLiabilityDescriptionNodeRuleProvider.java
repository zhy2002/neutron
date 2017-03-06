package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

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

        //todo move source to a profile
    }

}
