package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CreditCheckFlagNode;


@CreditCheckFlagNodeScope
public class CreditCheckFlagNodeRuleProvider
    extends BooleanUiNodeRuleProvider<CreditCheckFlagNode> {

    @Inject
    public CreditCheckFlagNodeRuleProvider() {}

    @Override
    public void initializeState(CreditCheckFlagNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
