package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class DobNodeRuleProvider implements RuleProvider<DobNode<?>> {

    @Inject
    public DobNodeRuleProvider() {}

    @Inject
    MembersInjector<DobRangeValidationRule> dobRangeValidationRuleInjector;

    @Override
    public List<UiNodeRule<DobNode<?>>> createRules(DobNode<?> node) {
        List<UiNodeRule<DobNode<?>>> rules = new ArrayList<>();
        rules.add(createDobRangeValidationRule(node));
        return rules;
    }

    private DobRangeValidationRule createDobRangeValidationRule(DobNode<?> node) {
        DobRangeValidationRule rule = newDobRangeValidationRule(node);
        dobRangeValidationRuleInjector.injectMembers(rule);
        return rule;
    }


    protected DobRangeValidationRule newDobRangeValidationRule(DobNode<?> node) {
        return new DobRangeValidationRuleImpl(node);
    }
}
