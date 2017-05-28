package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.TotalAssetNode;
import zhy2002.examples.lodgement.gen.di.*;

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

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
