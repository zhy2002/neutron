package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class AddressNodeRuleProvider implements RuleProvider<AddressNode<?>> {

    @Inject
    public AddressNodeRuleProvider() {}

    @Inject
    MembersInjector<UpdateAddressRefListRule> updateAddressRefListRuleInjector;

    @Override
    public List<UiNodeRule<AddressNode<?>>> createRules(AddressNode<?> node) {
        List<UiNodeRule<AddressNode<?>>> rules = new ArrayList<>();
        rules.add(createUpdateAddressRefListRule(node));
        return rules;
    }

    private UpdateAddressRefListRule createUpdateAddressRefListRule(AddressNode<?> node) {
        UpdateAddressRefListRule rule = newUpdateAddressRefListRule(node);
        updateAddressRefListRuleInjector.injectMembers(rule);
        return rule;
    }


    protected UpdateAddressRefListRule newUpdateAddressRefListRule(AddressNode<?> node) {
        return new UpdateAddressRefListRuleImpl(node);
    }
}
