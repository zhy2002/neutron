package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AccessOtherDescriptionNode;


@AccessOtherDescriptionNodeScope
public class AccessOtherDescriptionNodeRuleProvider
    extends StringUiNodeRuleProvider<AccessOtherDescriptionNode> {

    @Inject
    public AccessOtherDescriptionNodeRuleProvider() {}

    @Override
    public void initializeState(AccessOtherDescriptionNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
