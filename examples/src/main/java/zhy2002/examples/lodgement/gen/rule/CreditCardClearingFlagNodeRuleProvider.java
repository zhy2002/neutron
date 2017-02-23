package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@CreditCardClearingFlagNodeScope
public class CreditCardClearingFlagNodeRuleProvider extends BooleanUiNodeRuleProvider {

    @Inject
    public CreditCardClearingFlagNodeRuleProvider() {}

    @Inject
    Provider<CreditCardClearingFlagChangedRule> creditCardClearingFlagChangedRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(creditCardClearingFlagChangedRuleProvider.get());
    }

}
