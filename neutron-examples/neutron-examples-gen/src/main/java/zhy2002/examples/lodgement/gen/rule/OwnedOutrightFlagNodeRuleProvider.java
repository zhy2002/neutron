package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OwnedOutrightFlagNode;


@OwnedOutrightFlagNodeScope
public class OwnedOutrightFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<OwnedOutrightFlagNode> {

    @Inject
    public OwnedOutrightFlagNodeRuleProvider() {}

    @Override
    public void initializeState(OwnedOutrightFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
