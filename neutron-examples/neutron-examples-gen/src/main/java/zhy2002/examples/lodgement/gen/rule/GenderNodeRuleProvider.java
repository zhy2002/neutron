package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.GenderNode;


@GenderNodeScope
public class GenderNodeRuleProvider
    extends StringUiNodeRuleProvider<GenderNode> {

    @Inject
    public GenderNodeRuleProvider() {}

    @Override
    public void initializeState(GenderNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
