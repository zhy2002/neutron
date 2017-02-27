package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherIncomeDescriptionNode;


@OtherIncomeDescriptionNodeScope
public class OtherIncomeDescriptionNodeRuleProvider
    extends StringUiNodeRuleProvider<OtherIncomeDescriptionNode> {

    @Inject
    public OtherIncomeDescriptionNodeRuleProvider() {}

    @Override
    public void initializeState(OtherIncomeDescriptionNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
