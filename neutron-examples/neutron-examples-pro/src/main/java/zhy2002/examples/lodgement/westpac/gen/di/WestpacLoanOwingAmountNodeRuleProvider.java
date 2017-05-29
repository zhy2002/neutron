package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@LoanOwingAmountNodeScope
public class WestpacLoanOwingAmountNodeRuleProvider extends LoanOwingAmountNodeRuleProvider {

    @Inject
    public WestpacLoanOwingAmountNodeRuleProvider() {
    }

    @Override
    public void initializeState(LoanOwingAmountNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
