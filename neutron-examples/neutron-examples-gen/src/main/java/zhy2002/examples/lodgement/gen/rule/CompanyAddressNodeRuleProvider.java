package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.CompanyAddressNode;


@CompanyAddressNodeScope
public class CompanyAddressNodeRuleProvider
    extends AddressNodeRuleProvider<CompanyAddressNode> {

    @Inject
    public CompanyAddressNodeRuleProvider() {}

    @Override
    public void initializeState(CompanyAddressNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
