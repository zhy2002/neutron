package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.DefenseServiceFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class DefenseServiceFlagNode extends BooleanUiNode<PropertyNode> {

    @Inject
    public DefenseServiceFlagNode(@Owner PropertyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return DefenseServiceFlagNode.class;
    }

    protected final DefenseServiceFlagNodeComponent getComponent() {
        return component;
    }


    private DefenseServiceFlagNodeComponent component;

    @Inject
    void createComponent(DefenseServiceFlagNodeComponent.Builder builder) {
        this.component = builder.setDefenseServiceFlagNodeModule(new DefenseServiceFlagNodeModule(this)).build();
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
