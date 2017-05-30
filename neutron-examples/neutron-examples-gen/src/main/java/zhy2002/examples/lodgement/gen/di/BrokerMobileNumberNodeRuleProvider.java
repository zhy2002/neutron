package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BrokerMobileNumberNode;
import zhy2002.examples.lodgement.gen.di.*;

@BrokerMobileNumberNodeScope
public class BrokerMobileNumberNodeRuleProvider implements RuleProvider<BrokerMobileNumberNode> {

    @Inject
    BaseMobileNumberNodeRuleProvider parentRuleProvider;

    @Inject
    public BrokerMobileNumberNodeRuleProvider() {
    }

    @Override
    public void initializeState(BrokerMobileNumberNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
