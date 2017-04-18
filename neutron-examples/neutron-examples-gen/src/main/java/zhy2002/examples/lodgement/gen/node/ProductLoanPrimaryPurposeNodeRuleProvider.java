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

@ProductLoanPrimaryPurposeNodeScope
public class ProductLoanPrimaryPurposeNodeRuleProvider implements RuleProvider<ProductLoanPrimaryPurposeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductLoanPrimaryPurposeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductLoanPrimaryPurposeNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.NAB_PRIMARY_PURPOSE);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
