package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@MortgageLimitAmountNodeScope
public class BankAMortgageLimitAmountNodeRuleProvider extends MortgageLimitAmountNodeRuleProvider {

    @Inject
    public BankAMortgageLimitAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageLimitAmountNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
