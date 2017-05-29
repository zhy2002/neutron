package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@FeeAmountNodeScope
public class BankAFeeAmountNodeRuleProvider extends FeeAmountNodeRuleProvider {

    @Inject
    public BankAFeeAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(FeeAmountNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setMinValue(new BigDecimal("0.01"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
