package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AccessContactTypeNode;


@AccessContactTypeNodeScope
public class AccessContactTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<AccessContactTypeNode> {

    @Inject
    public AccessContactTypeNodeRuleProvider() {}

    @Override
    public void initializeState(AccessContactTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
