package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AccessContactFirstNameNode;


@AccessContactFirstNameNodeScope
public class AccessContactFirstNameNodeRuleProvider
    extends StringUiNodeRuleProvider<AccessContactFirstNameNode> {

    @Inject
    public AccessContactFirstNameNodeRuleProvider() {}

    @Override
    public void initializeState(AccessContactFirstNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
