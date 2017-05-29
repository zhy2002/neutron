package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ProductLoanPrimaryPurposeNodeScope
public class WestpacProductLoanPrimaryPurposeNodeRuleProvider extends ProductLoanPrimaryPurposeNodeRuleProvider {

    @Inject
    public WestpacProductLoanPrimaryPurposeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductLoanPrimaryPurposeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.NAB_PRIMARY_PURPOSE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
