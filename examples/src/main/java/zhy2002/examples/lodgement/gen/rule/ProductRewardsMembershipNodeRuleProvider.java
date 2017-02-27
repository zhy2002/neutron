package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ProductRewardsMembershipNode;


@ProductRewardsMembershipNodeScope
public class ProductRewardsMembershipNodeRuleProvider
    extends StringUiNodeRuleProvider<ProductRewardsMembershipNode> {

    @Inject
    public ProductRewardsMembershipNodeRuleProvider() {}

    @Override
    public void initializeState(ProductRewardsMembershipNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
