package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.LoanTypeNode;


@LoanTypeNodeScope
public class LoanTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<LoanTypeNode> {

    @Inject
    public LoanTypeNodeRuleProvider() {}

    @Override
    public void initializeState(LoanTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
