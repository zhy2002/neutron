package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.ThirdPartyEmailNode;
import zhy2002.examples.lodgement.gen.di.*;

@ComponentScope
public class ThirdPartyEmailNodeRuleProvider implements RuleProvider<ThirdPartyEmailNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ThirdPartyEmailNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyEmailNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
