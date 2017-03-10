package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;


public class AddressNodeRuleProvider implements RuleProvider<AddressNode<?>> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public AddressNodeRuleProvider() {
    }

    @Override
    public void initializeState(AddressNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Inject
    Provider<UpdateAddressRefListRule> updateAddressRefListRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(updateAddressRefListRuleProvider.get());
    }

}
