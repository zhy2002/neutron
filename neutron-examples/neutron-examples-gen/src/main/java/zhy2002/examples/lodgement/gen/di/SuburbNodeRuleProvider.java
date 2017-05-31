package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.SuburbNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class SuburbNodeRuleProvider implements RuleProvider<SuburbNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SuburbNodeRuleProvider() {
    }

    @Override
    public void initializeState(SuburbNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
