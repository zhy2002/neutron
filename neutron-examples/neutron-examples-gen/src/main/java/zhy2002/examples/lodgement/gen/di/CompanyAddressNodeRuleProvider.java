package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.CompanyAddressNode;
import zhy2002.examples.lodgement.gen.di.*;

@CompanyAddressNodeScope
public class CompanyAddressNodeRuleProvider implements RuleProvider<CompanyAddressNode> {

    @Inject
    AddressNodeRuleProvider parentRuleProvider;

    @Inject
    public CompanyAddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyAddressNode node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
