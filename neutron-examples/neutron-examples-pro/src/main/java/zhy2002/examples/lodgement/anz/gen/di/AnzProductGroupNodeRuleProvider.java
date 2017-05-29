package zhy2002.examples.lodgement.anz.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.anz.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ProductGroupNodeScope
public class AnzProductGroupNodeRuleProvider extends ProductGroupNodeRuleProvider {

    @Inject
    public AnzProductGroupNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductGroupNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.NAB_PRODUCT_GROUP);
    }

    @Inject
    Provider<ProductGroupChangedRule> productGroupChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        ProductGroupChangedRule productGroupChangedRule = productGroupChangedRuleProvider.get();
        createdRules.add(productGroupChangedRule);
    }

}
