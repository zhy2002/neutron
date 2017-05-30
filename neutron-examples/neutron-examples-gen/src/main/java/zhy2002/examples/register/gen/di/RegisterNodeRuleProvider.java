package zhy2002.examples.register.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.node.RegisterNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.gen.rule.*;

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
