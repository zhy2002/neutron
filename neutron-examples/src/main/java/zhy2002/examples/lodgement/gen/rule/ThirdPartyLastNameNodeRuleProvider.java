package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyLastNameNode;


@ThirdPartyLastNameNodeScope
public class ThirdPartyLastNameNodeRuleProvider
    extends StringUiNodeRuleProvider<ThirdPartyLastNameNode> {

    @Inject
    public ThirdPartyLastNameNodeRuleProvider() {}

    @Override
    public void initializeState(ThirdPartyLastNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
