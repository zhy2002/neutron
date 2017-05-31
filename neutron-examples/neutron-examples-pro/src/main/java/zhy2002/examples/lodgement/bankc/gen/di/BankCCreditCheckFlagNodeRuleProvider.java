package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ComponentScope
public class BankCCreditCheckFlagNodeRuleProvider extends CreditCheckFlagNodeRuleProvider {

    @Inject
    public BankCCreditCheckFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(CreditCheckFlagNode node) {
        super.initializeState(node);

        node.setFixedValue(true);
    }

    @Inject
    Provider<BooleanFixedValueValidationRule> booleanFixedValueValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        BooleanFixedValueValidationRule booleanFixedValueValidationRule = booleanFixedValueValidationRuleProvider.get();
        createdRules.add(booleanFixedValueValidationRule);
    }

}
