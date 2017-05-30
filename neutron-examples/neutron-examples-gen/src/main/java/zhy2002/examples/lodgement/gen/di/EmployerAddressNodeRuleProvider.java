package zhy2002.examples.lodgement.gen.di;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.EmployerAddressNode;
import zhy2002.examples.lodgement.gen.di.*;

@EmployerAddressNodeScope
public class EmployerAddressNodeRuleProvider implements RuleProvider<EmployerAddressNode> {

    @Inject
    AddressNodeRuleProvider parentRuleProvider;

    @Inject
    public EmployerAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmployerAddressNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
