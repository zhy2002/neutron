package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.AccessTelephoneNode;
import zhy2002.examples.lodgement.gen.di.*;

@AccessTelephoneNodeScope
public class AccessTelephoneNodeRuleProvider implements RuleProvider<AccessTelephoneNode> {

    @Inject
    TelephoneNodeRuleProvider parentRuleProvider;

    @Inject
    public AccessTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessTelephoneNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
