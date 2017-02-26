package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyDisclosureFlagNode;


@ThirdPartyDisclosureFlagNodeScope
public class ThirdPartyDisclosureFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<ThirdPartyDisclosureFlagNode> {

    @Inject
    public ThirdPartyDisclosureFlagNodeRuleProvider() {}

    @Override
    public void initializeState(ThirdPartyDisclosureFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
