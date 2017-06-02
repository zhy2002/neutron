package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.BaseMobileNumberNode;
import zhy2002.examples.lodgement.gen.di.*;


public class BaseMobileNumberNodeRuleProvider implements RuleProvider<BaseMobileNumberNode<?>> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseMobileNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseMobileNumberNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
