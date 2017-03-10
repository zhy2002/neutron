package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;


public class TelephoneNodeRuleProvider implements RuleProvider<TelephoneNode<?>> {

    @Inject
    LeafUiNodeRuleProvider parentRuleProvider;

    @Inject
    public TelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(TelephoneNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<TelephoneCompleteRule> telephoneCompleteRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(telephoneCompleteRuleProvider.get());
    }

}
