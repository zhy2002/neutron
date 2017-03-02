package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.SettlementDateNode;


@SettlementDateNodeScope
public class SettlementDateNodeRuleProvider
    extends StringUiNodeRuleProvider<SettlementDateNode> {

    @Inject
    public SettlementDateNodeRuleProvider() {}

    @Override
    public void initializeState(SettlementDateNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
