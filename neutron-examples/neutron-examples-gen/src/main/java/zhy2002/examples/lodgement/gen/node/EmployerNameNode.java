package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EmployerNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EmployerNameNode extends StringUiNode<EmployedNode> {

    @Inject
    protected EmployerNameNode(@Owner EmployedNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EmployerNameNode.class;
    }

    protected final EmployerNameNodeComponent getComponent() {
        return component;
    }


    private EmployerNameNodeComponent component;

    @Inject
    void createComponent(EmployerNameNodeComponent.Builder builder) {
        this.component = builder.setEmployerNameNodeModule(new EmployerNameNodeModule(this)).build();
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
