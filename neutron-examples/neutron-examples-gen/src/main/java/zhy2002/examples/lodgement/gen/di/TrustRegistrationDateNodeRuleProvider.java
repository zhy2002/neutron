package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.TrustRegistrationDateNode;
import zhy2002.examples.lodgement.gen.di.*;

@TrustRegistrationDateNodeScope
public class TrustRegistrationDateNodeRuleProvider implements RuleProvider<TrustRegistrationDateNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public TrustRegistrationDateNodeRuleProvider() {
    }

    @Override
    public void initializeState(TrustRegistrationDateNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
