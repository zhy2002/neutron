package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.BrokerCompanyNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class BrokerCompanyNodeRuleProvider implements RuleProvider<BrokerCompanyNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BrokerCompanyNodeRuleProvider() {
    }

    @Override
    public void initializeState(BrokerCompanyNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
