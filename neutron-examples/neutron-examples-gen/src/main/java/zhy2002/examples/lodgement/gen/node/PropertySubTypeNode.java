package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PropertySubTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PropertySubTypeNode extends StringUiNode<PropertyNode> {

    @Inject
    protected PropertySubTypeNode(@Owner PropertyNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertySubTypeNode.class;
    }

    protected final PropertySubTypeNodeComponent getComponent() {
        return component;
    }


    private PropertySubTypeNodeComponent component;

    @Inject
    void createComponent(PropertySubTypeNodeComponent.Builder builder) {
        this.component = builder.setPropertySubTypeNodeModule(new PropertySubTypeNodeModule(this)).build();
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
