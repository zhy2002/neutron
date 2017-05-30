package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.ThirdPartyAddressNode;
import zhy2002.examples.lodgement.gen.di.*;

@ThirdPartyAddressNodeScope
public class ThirdPartyAddressNodeRuleProvider implements RuleProvider<ThirdPartyAddressNode> {

    @Inject
    AddressNodeRuleProvider parentRuleProvider;

    @Inject
    public ThirdPartyAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(ThirdPartyAddressNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
