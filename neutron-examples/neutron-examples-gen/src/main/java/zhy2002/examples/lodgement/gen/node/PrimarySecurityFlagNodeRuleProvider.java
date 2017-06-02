package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.PrimarySecurityFlagNode;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ComponentScope
public class PrimarySecurityFlagNodeRuleProvider implements RuleProvider<PrimarySecurityFlagNode> {

    @Inject
    BooleanUiNodeRuleProvider parentRuleProvider;

    @Inject
    public PrimarySecurityFlagNodeRuleProvider() {
    }

    @Override
    public void initializeState(PrimarySecurityFlagNode node) {
        parentRuleProvider.initializeState(node);

        node.setValue(null);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
