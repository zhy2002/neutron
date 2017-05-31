package zhy2002.examples.register.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.register.gen.node.ErrorNode;
import zhy2002.examples.register.gen.di.*;

@ComponentScope
public class ErrorNodeRuleProvider implements RuleProvider<ErrorNode> {

    @Inject
    ValidationErrorUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ErrorNodeRuleProvider() {
    }

    @Override
    public void initializeState(ErrorNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
