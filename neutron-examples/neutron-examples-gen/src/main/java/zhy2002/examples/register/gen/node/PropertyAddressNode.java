package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.PropertyAddressNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class PropertyAddressNode extends StringUiNode<PropertyDetailsNode> {

    @Inject
    public PropertyAddressNode(@Owner PropertyDetailsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertyAddressNode.class;
    }

    protected final PropertyAddressNodeComponent getComponent() {
        return component;
    }


    private PropertyAddressNodeComponent component;

    @Inject
    void createComponent(PropertyAddressNodeComponent.Builder builder) {
        this.component = builder.setPropertyAddressNodeModule(new PropertyAddressNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
