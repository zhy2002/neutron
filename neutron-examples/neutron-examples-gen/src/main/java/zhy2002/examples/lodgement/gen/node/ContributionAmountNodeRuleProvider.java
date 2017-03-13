package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ContributionAmountNodeScope
public class ContributionAmountNodeRuleProvider implements RuleProvider<ContributionAmountNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public ContributionAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(ContributionAmountNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequired(true);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
