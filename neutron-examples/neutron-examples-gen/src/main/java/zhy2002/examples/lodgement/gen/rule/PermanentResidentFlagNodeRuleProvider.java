package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.PermanentResidentFlagNode;


@PermanentResidentFlagNodeScope
public class PermanentResidentFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<PermanentResidentFlagNode> {

    @Inject
    public PermanentResidentFlagNodeRuleProvider() {}

    @Override
    public void initializeState(PermanentResidentFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
