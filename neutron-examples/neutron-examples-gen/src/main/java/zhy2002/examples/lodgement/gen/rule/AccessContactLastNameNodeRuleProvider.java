package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AccessContactLastNameNode;


@AccessContactLastNameNodeScope
public class AccessContactLastNameNodeRuleProvider
    extends StringUiNodeRuleProvider<AccessContactLastNameNode> {

    @Inject
    public AccessContactLastNameNodeRuleProvider() {}

    @Override
    public void initializeState(AccessContactLastNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}