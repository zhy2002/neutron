package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AccessNode;


@AccessNodeScope
public class AccessNodeRuleProvider
    extends ObjectUiNodeRuleProvider<AccessNode> {

    @Inject
    public AccessNodeRuleProvider() {}

    @Override
    public void initializeState(AccessNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
