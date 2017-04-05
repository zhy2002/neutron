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

@RealEstateListNodeScope
public class RealEstateListNodeRuleProvider implements RuleProvider<RealEstateListNode> {

    @Inject
    ListUiNodeRuleProvider parentRuleProvider;

    @Inject
    public RealEstateListNodeRuleProvider() {
    }

    @Override
    public void initializeState(RealEstateListNode node) {
        parentRuleProvider.initializeState(node);

        node.setMinItemCount(1);
    }

    @Inject
    Provider<AutoCreateListItemRule> autoCreateListItemRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        AutoCreateListItemRule autoCreateListItemRule = autoCreateListItemRuleProvider.get();
        createdRules.add(autoCreateListItemRule);
    }

}
