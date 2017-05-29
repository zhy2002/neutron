package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CreditCardOwnershipListNodeScope
public class BankCCreditCardOwnershipListNodeRuleProvider extends CreditCardOwnershipListNodeRuleProvider {

    @Inject
    public BankCCreditCardOwnershipListNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCardOwnershipListNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
