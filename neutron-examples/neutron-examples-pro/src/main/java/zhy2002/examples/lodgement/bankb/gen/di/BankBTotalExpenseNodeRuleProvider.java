package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@TotalExpenseNodeScope
public class BankBTotalExpenseNodeRuleProvider extends TotalExpenseNodeRuleProvider {

    @Inject
    public BankBTotalExpenseNodeRuleProvider() {
    }

    @Override
    public void initializeState(TotalExpenseNode node) {
        super.initializeState(node);

        node.setMinValue(new BigDecimal("0"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}