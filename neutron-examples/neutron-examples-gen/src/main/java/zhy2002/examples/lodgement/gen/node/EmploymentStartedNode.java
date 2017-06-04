package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmploymentStartedNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmploymentStartedNode extends MonthYearNode<EmployedNode> {

    @Inject
    protected EmploymentStartedNode(@Owner EmployedNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EmploymentStartedNode.class;
    }

    protected final EmploymentStartedNodeComponent getComponent() {
        return component;
    }


    private EmploymentStartedNodeComponent component;

    @Inject
    void createComponent(EmploymentStartedNodeComponent.Builder builder) {
        this.component = builder.setEmploymentStartedNodeModule(new EmploymentStartedNodeModule(this)).build();
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
