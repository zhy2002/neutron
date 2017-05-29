package zhy2002.examples.lodgement.bankb.di;

import zhy2002.examples.lodgement.bankb.gen.di.BankBLegalActionNodeRuleProvider;
import zhy2002.examples.lodgement.gen.di.LegalActionNodeScope;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.StringEnableSiblingRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;

@LegalActionNodeScope
public class LegalActionNodeRuleProviderImpl extends BankBLegalActionNodeRuleProvider {

    @Inject
    public LegalActionNodeRuleProviderImpl() {
    }

    @Inject
    Provider<StringEnableSiblingRule> stringEnableSiblingRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        StringEnableSiblingRule rule = stringEnableSiblingRuleProvider.get();
        rule.setSiblingName("creditHistoryListNode");
        createdRules.add(rule);
    }
}