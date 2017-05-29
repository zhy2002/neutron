package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.banka.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class BankATelephoneNodeRuleProvider extends TelephoneNodeRuleProvider {

    @Inject
    public BankATelephoneNodeRuleProvider() {
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

        TelephoneCompleteRule telephoneCompleteRule = telephoneCompleteRuleProvider.get();
        createdRules.add(telephoneCompleteRule);
        AustralianTelephoneRule australianTelephoneRule = australianTelephoneRuleProvider.get();
        createdRules.add(australianTelephoneRule);
    }

}
