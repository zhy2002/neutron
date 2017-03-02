package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.LoanLimitAmountNode;


@LoanLimitAmountNodeScope
public class LoanLimitAmountNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<LoanLimitAmountNode> {

    @Inject
    public LoanLimitAmountNodeRuleProvider() {}

    @Override
    public void initializeState(LoanLimitAmountNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
