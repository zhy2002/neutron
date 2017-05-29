package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;



public class BankCTelephoneNodeRuleProvider extends TelephoneNodeRuleProvider {

    @Inject
    public BankCTelephoneNodeRuleProvider() {
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
