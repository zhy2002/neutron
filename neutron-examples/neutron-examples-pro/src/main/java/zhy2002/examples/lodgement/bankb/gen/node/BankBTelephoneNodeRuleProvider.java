package zhy2002.examples.lodgement.bankb.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class BankBTelephoneNodeRuleProvider extends TelephoneNodeRuleProvider {

    @Inject
    public BankBTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(TelephoneNode<?> node) {
        super.initializeState(node);

    }

    @Inject
    Provider<TelephoneCompleteRule> telephoneCompleteRuleProvider;
    @Inject
    Provider<AustralianTelephoneRule> australianTelephoneRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        {
            TelephoneCompleteRule telephoneCompleteRule = telephoneCompleteRuleProvider.get();
            createdRules.add(telephoneCompleteRule);
        }
        {
            AustralianTelephoneRule australianTelephoneRule = australianTelephoneRuleProvider.get();
            createdRules.add(australianTelephoneRule);
        }
    }

}
