package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.RetiredEmploymentNode;


@RetiredEmploymentNodeScope
public class RetiredEmploymentNodeRuleProvider
    extends ObjectUiNodeRuleProvider<RetiredEmploymentNode> {

    @Inject
    public RetiredEmploymentNodeRuleProvider() {}

    @Override
    public void initializeState(RetiredEmploymentNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
