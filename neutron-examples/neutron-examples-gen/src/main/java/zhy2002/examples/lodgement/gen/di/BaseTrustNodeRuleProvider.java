package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.BaseTrustNode;
import zhy2002.examples.lodgement.gen.di.*;


public class BaseTrustNodeRuleProvider implements RuleProvider<BaseTrustNode<?>> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseTrustNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseTrustNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
