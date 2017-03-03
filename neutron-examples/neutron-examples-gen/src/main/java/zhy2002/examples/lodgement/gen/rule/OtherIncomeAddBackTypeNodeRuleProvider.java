package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.OtherIncomeAddBackTypeNode;


@OtherIncomeAddBackTypeNodeScope
public class OtherIncomeAddBackTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<OtherIncomeAddBackTypeNode> {

    @Inject
    public OtherIncomeAddBackTypeNodeRuleProvider() {}

    @Override
    public void initializeState(OtherIncomeAddBackTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
