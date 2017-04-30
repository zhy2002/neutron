package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.neutron.rule.*;

@RegisterNodeScope
public class RegisterNodeRuleProvider implements RuleProvider<RegisterNode> {

    @Inject
    RootUiNodeRuleProvider parentRuleProvider;

    @Inject
    public RegisterNodeRuleProvider() {
    }

    @Override
    public void initializeState(RegisterNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<SetHasErrorRule> setHasErrorRuleProvider;
    @Inject
    Provider<MergeValidationErrorsRule> mergeValidationErrorsRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        SetHasErrorRule setHasErrorRule = setHasErrorRuleProvider.get();
        createdRules.add(setHasErrorRule);
        MergeValidationErrorsRule mergeValidationErrorsRule = mergeValidationErrorsRuleProvider.get();
        createdRules.add(mergeValidationErrorsRule);
    }

}
