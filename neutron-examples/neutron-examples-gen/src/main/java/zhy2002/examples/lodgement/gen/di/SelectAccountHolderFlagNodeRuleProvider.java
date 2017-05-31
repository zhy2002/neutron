package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.SelectAccountHolderFlagNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class SelectAccountHolderFlagNodeRuleProvider implements RuleProvider<SelectAccountHolderFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public SelectAccountHolderFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(SelectAccountHolderFlagNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
