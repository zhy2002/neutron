package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

@ThirdPartyDobNodeScope
public class ThirdPartyDobNodeRuleProvider implements RuleProvider<ThirdPartyDobNode> {

    @Inject
    DobNodeRuleProvider parentRuleProvider;

    @Inject
    public ThirdPartyDobNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyDobNode node) {
        parentRuleProvider.initializeState(node);

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
