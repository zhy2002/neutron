package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.LoanLenderNameNode;


@LoanLenderNameNodeScope
public class LoanLenderNameNodeRuleProvider
    extends StringUiNodeRuleProvider<LoanLenderNameNode> {

    @Inject
    public LoanLenderNameNodeRuleProvider() {}

    @Override
    public void initializeState(LoanLenderNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
