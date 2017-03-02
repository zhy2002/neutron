package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductNameNode;


@ProductNameNodeScope
public class ProductNameNodeRuleProvider
    extends StringUiNodeRuleProvider<ProductNameNode> {

    @Inject
    public ProductNameNodeRuleProvider() {}

    @Override
    public void initializeState(ProductNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
