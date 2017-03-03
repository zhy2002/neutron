package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.LoanOwingAmountNode;


@LoanOwingAmountNodeScope
public class LoanOwingAmountNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<LoanOwingAmountNode> {

    @Inject
    public LoanOwingAmountNodeRuleProvider() {}

    @Override
    public void initializeState(LoanOwingAmountNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}