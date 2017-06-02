package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.FeePayFromNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class FeePayFromNodeRuleProvider implements RuleProvider<FeePayFromNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public FeePayFromNodeRuleProvider() {
    }

    @Override
    public void initializeState(FeePayFromNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
