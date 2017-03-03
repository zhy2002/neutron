package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CreditCardLenderNameNode;


@CreditCardLenderNameNodeScope
public class CreditCardLenderNameNodeRuleProvider
    extends StringUiNodeRuleProvider<CreditCardLenderNameNode> {

    @Inject
    public CreditCardLenderNameNodeRuleProvider() {}

    @Override
    public void initializeState(CreditCardLenderNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
