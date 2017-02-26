package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.EmployerAddressNode;


@EmployerAddressNodeScope
public class EmployerAddressNodeRuleProvider
    extends AddressNodeRuleProvider<EmployerAddressNode> {

    @Inject
    public EmployerAddressNodeRuleProvider() {}

    @Override
    public void initializeState(EmployerAddressNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
