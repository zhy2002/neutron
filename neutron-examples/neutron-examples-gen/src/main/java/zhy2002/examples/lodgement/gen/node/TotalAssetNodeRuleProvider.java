package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@TotalAssetNodeScope
public class TotalAssetNodeRuleProvider implements RuleProvider<TotalAssetNode> {

    @Inject
    BaseCurrencyNodeRuleProvider parentRuleProvider;

    @Inject
    public TotalAssetNodeRuleProvider() {
    }

    @Override
    public void initializeState(TotalAssetNode node) {
        parentRuleProvider.initializeState(node);

        node.setMinValue(new BigDecimal("0"));
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
