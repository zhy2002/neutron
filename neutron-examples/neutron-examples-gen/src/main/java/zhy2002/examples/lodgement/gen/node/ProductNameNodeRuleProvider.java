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

@ProductNameNodeScope
public class ProductNameNodeRuleProvider implements RuleProvider<ProductNameNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ProductNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductNameNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.NAB_PRODUCT_NAME);
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
