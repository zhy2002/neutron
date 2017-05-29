package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ProductNameNodeScope
public class WestpacProductNameNodeRuleProvider extends ProductNameNodeRuleProvider {

    @Inject
    public WestpacProductNameNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductNameNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.NAB_PRODUCT_NAME);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
