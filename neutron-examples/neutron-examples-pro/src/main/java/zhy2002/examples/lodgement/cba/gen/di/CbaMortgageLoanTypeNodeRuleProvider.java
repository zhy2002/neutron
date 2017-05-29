package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@MortgageLoanTypeNodeScope
public class CbaMortgageLoanTypeNodeRuleProvider extends MortgageLoanTypeNodeRuleProvider {

    @Inject
    public CbaMortgageLoanTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(MortgageLoanTypeNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setOptions(ApplicationNodeConstants.LIABILITY_LOAN_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
