package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SpouseNode;


@SpouseNodeScope
public class SpouseNodeRuleProvider
    extends StringUiNodeRuleProvider<SpouseNode> {

    @Inject
    public SpouseNodeRuleProvider() {}

    @Override
    public void initializeState(SpouseNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
