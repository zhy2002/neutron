package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ContributionAmountNodeScope
public class BankBContributionAmountNodeRuleProvider extends ContributionAmountNodeRuleProvider {

    @Inject
    public BankBContributionAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(ContributionAmountNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setMinValue(new BigDecimal("0.01"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}