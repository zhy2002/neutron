package zhy2002.examples.lodgement.bankc.di;

import zhy2002.examples.lodgement.bankc.gen.node.BankCPropertySubTypeNodeRuleProvider;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.rule.LatestUsedItemRule;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.List;


class PropertySubTypeNodeRuleProviderImpl extends BankCPropertySubTypeNodeRuleProvider {

    @Inject
    public PropertySubTypeNodeRuleProviderImpl() {
    }

    @Inject
    Provider<LatestUsedItemRule> latestUsedItemRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.add(latestUsedItemRuleProvider.get());
    }
}