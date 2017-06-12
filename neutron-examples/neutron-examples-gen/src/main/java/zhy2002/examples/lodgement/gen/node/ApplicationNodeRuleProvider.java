package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ComponentScope
public class ApplicationNodeRuleProvider implements RuleProvider<ApplicationNode> {

    @Inject
    RootUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ApplicationNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApplicationNode node) {
        parentRuleProvider.initializeState(node);

        node.setSelectedName("personListNode");
    }

    @Inject
    Provider<MergeValidationErrorsRule> mergeValidationErrorsRuleProvider;
    @Inject
    Provider<ShowErrorListRule> showErrorListRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        MergeValidationErrorsRule mergeValidationErrorsRule = mergeValidationErrorsRuleProvider.get();
        createdRules.add(mergeValidationErrorsRule);
        ShowErrorListRule showErrorListRule = showErrorListRuleProvider.get();
        createdRules.add(showErrorListRule);
    }

}
