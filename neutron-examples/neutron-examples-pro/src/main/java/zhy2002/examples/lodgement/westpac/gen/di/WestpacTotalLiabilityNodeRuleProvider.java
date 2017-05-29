package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@TotalLiabilityNodeScope
public class WestpacTotalLiabilityNodeRuleProvider extends TotalLiabilityNodeRuleProvider {

    @Inject
    public WestpacTotalLiabilityNodeRuleProvider() {
    }

    @Override
    public void initializeState(TotalLiabilityNode node) {
        super.initializeState(node);

        node.setMinValue(new BigDecimal("0"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
