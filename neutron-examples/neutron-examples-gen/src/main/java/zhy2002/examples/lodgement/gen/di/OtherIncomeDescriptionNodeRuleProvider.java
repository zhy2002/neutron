package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.OtherIncomeDescriptionNode;
import zhy2002.examples.lodgement.gen.di.*;

@OtherIncomeDescriptionNodeScope
public class OtherIncomeDescriptionNodeRuleProvider implements RuleProvider<OtherIncomeDescriptionNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherIncomeDescriptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherIncomeDescriptionNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}