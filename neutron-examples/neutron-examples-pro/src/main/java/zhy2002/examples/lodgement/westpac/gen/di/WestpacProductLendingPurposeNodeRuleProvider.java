package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ProductLendingPurposeNodeScope
public class WestpacProductLendingPurposeNodeRuleProvider extends ProductLendingPurposeNodeRuleProvider {

    @Inject
    public WestpacProductLendingPurposeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ProductLendingPurposeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.NAB_LENDING_PURPOSE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
