package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;

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

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
