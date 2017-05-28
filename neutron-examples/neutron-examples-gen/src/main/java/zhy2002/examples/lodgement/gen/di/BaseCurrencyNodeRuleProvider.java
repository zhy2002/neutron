package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BaseCurrencyNode;
import zhy2002.examples.lodgement.gen.di.*;


public class BaseCurrencyNodeRuleProvider implements RuleProvider<BaseCurrencyNode<?>> {

    @Inject
    BigDecimalUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseCurrencyNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseCurrencyNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
