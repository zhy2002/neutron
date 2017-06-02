package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OccupationNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OccupationNode extends BaseOccupationNode<EmployedNode> {

    @Inject
    protected OccupationNode(@Owner EmployedNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OccupationNode.class;
    }

    protected final OccupationNodeComponent getComponent() {
        return component;
    }


    private OccupationNodeComponent component;

    @Inject
    void createComponent(OccupationNodeComponent.Builder builder) {
        this.component = builder.setOccupationNodeModule(new OccupationNodeModule(this)).build();
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
