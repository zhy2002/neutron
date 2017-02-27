package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyFirstNameNode;


@ThirdPartyFirstNameNodeScope
public class ThirdPartyFirstNameNodeRuleProvider
    extends StringUiNodeRuleProvider<ThirdPartyFirstNameNode> {

    @Inject
    public ThirdPartyFirstNameNodeRuleProvider() {}

    @Override
    public void initializeState(ThirdPartyFirstNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
