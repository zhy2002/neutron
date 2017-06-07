package zhy2002.examples.app.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.GlobalUiStateNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.app.gen.di.*;
import zhy2002.examples.app.gen.rule.*;

@ComponentScope
public class GlobalUiStateNodeRuleProvider implements RuleProvider<GlobalUiStateNode> {

    @Inject
    RootUiNodeRuleProvider parentRuleProvider;

    @Inject
    public GlobalUiStateNodeRuleProvider() {
    }

    @Override
    public void initializeState(GlobalUiStateNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<UpdateSelectedTabIndexRule> updateSelectedTabIndexRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        UpdateSelectedTabIndexRule updateSelectedTabIndexRule = updateSelectedTabIndexRuleProvider.get();
        createdRules.add(updateSelectedTabIndexRule);
    }

}
