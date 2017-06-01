package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PropertyAddressNode extends AddressNode<PropertyNode> {

    private PropertyAddressNodeComponent component;

    @Inject
    public PropertyAddressNode(@Owner PropertyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertyAddressNode.class;
    }

    @Inject
    void createComponent(PropertyAddressNodeComponent.Builder builder) {
        this.component = builder.setPropertyAddressNodeModule(new PropertyAddressNodeModule(this)).build();
    }

    private RuleProvider<PropertyAddressNode> getRuleProvider() {
        return component.getPropertyAddressNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<PropertyAddressNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
