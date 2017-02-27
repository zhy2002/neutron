package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyEmailNode;


@ThirdPartyEmailNodeScope
public class ThirdPartyEmailNodeRuleProvider
    extends StringUiNodeRuleProvider<ThirdPartyEmailNode> {

    @Inject
    public ThirdPartyEmailNodeRuleProvider() {}

    @Override
    public void initializeState(ThirdPartyEmailNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
