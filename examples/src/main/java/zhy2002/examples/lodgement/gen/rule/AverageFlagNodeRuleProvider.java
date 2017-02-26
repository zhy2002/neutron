package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.AverageFlagNode;


@AverageFlagNodeScope
public class AverageFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<AverageFlagNode> {

    @Inject
    public AverageFlagNodeRuleProvider() {}

    @Override
    public void initializeState(AverageFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
