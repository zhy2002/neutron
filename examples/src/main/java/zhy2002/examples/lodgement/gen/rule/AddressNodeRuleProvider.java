package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;


public abstract class AddressNodeRuleProvider extends ObjectUiNodeRuleProvider {


    @Inject
    Provider<UpdateAddressRefListRule> updateAddressRefListRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(updateAddressRefListRuleProvider.get());
    }

}
