package zhy2002.examples.lodgement.westpac.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CreditCardTypeNodeScope
public class WestpacCreditCardTypeNodeRuleProvider extends CreditCardTypeNodeRuleProvider {

    @Inject
    public WestpacCreditCardTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.CREDIT_CARD_TYPE);
        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
