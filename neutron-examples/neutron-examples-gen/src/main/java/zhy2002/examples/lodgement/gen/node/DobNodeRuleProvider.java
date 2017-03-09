package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


public class DobNodeRuleProvider implements RuleProvider<DobNode<?>> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public DobNodeRuleProvider() {
    }

    @Override
    public void initializeState(DobNode<?> node) {
        parentRuleProvider.initializeState(node);

        node.setMinAge(18);
        node.setMaxAge(100);
    }

    @Inject
    Provider<DobRangeValidationRule> dobRangeValidationRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(dobRangeValidationRuleProvider.get());
    }

}
