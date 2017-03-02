package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyTypeNode;


@ThirdPartyTypeNodeScope
public class ThirdPartyTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<ThirdPartyTypeNode> {

    @Inject
    public ThirdPartyTypeNodeRuleProvider() {}

    @Override
    public void initializeState(ThirdPartyTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
