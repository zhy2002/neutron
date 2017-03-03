package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CreditCardTypeNode;


@CreditCardTypeNodeScope
public class CreditCardTypeNodeRuleProvider
    extends StringUiNodeRuleProvider<CreditCardTypeNode> {

    @Inject
    public CreditCardTypeNodeRuleProvider() {}

    @Override
    public void initializeState(CreditCardTypeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
