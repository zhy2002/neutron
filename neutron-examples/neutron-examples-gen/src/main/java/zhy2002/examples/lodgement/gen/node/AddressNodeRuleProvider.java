package zhy2002.examples.lodgement.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.AddressNode;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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
    @Inject
    Provider<ObjectValueRequiredValidationRule> objectValueRequiredValidationRuleProvider;
    @Inject
    Provider<MaintainDisabledAncestorCountRule> maintainDisabledAncestorCountRuleProvider;
    @Inject
    Provider<MaintainReadonlyAncestorCountRule> maintainReadonlyAncestorCountRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        UpdateAddressRefListRule updateAddressRefListRule = updateAddressRefListRuleProvider.get();
        createdRules.add(updateAddressRefListRule);
        ObjectValueRequiredValidationRule objectValueRequiredValidationRule = objectValueRequiredValidationRuleProvider.get();
        createdRules.add(objectValueRequiredValidationRule);
        MaintainDisabledAncestorCountRule maintainDisabledAncestorCountRule = maintainDisabledAncestorCountRuleProvider.get();
        createdRules.add(maintainDisabledAncestorCountRule);
        MaintainReadonlyAncestorCountRule maintainReadonlyAncestorCountRule = maintainReadonlyAncestorCountRuleProvider.get();
        createdRules.add(maintainReadonlyAncestorCountRule);
    }

}
