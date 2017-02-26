package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TotalAssetNode;


@TotalAssetNodeScope
public class TotalAssetNodeRuleProvider
    extends BaseCurrencyNodeRuleProvider<TotalAssetNode> {

    @Inject
    public TotalAssetNodeRuleProvider() {}

    @Override
    public void initializeState(TotalAssetNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
