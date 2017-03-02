package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductRepaymentFrequencyNode;


@ProductRepaymentFrequencyNodeScope
public class ProductRepaymentFrequencyNodeRuleProvider
    extends StringUiNodeRuleProvider<ProductRepaymentFrequencyNode> {

    @Inject
    public ProductRepaymentFrequencyNodeRuleProvider() {}

    @Override
    public void initializeState(ProductRepaymentFrequencyNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
