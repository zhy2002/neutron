package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.GrossYearlySalaryNode;


@GrossYearlySalaryNodeScope
public class GrossYearlySalaryNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<GrossYearlySalaryNode> {

    @Inject
    public GrossYearlySalaryNodeRuleProvider() {}

    @Override
    public void initializeState(GrossYearlySalaryNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
