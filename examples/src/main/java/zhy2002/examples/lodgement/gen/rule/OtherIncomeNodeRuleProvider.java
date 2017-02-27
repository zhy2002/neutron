package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherIncomeNode;


@OtherIncomeNodeScope
public class OtherIncomeNodeRuleProvider
    extends ObjectUiNodeRuleProvider<OtherIncomeNode> {

    @Inject
    public OtherIncomeNodeRuleProvider() {}

    @Override
    public void initializeState(OtherIncomeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
