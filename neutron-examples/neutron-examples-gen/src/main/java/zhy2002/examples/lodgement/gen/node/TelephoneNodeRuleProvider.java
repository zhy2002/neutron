package zhy2002.examples.lodgement.gen.node;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
