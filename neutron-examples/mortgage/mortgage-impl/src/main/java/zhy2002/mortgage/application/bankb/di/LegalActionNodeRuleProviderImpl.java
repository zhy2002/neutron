package zhy2002.mortgage.application.bankb.di;

import zhy2002.mortgage.application.gen.node.LegalActionNodeRuleProvider;
import zhy2002.neutron.core.UiNodeRule;
import zhy2002.neutron.core.rule.StringEnableSiblingRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


public class LegalActionNodeRuleProviderImpl extends LegalActionNodeRuleProvider {

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