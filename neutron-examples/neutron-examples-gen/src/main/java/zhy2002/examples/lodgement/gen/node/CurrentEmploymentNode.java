package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CurrentEmploymentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CurrentEmploymentNode extends EmploymentNode<CurrentEmploymentListNode> {

    @Inject
    protected CurrentEmploymentNode(@Owner CurrentEmploymentListNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CurrentEmploymentNode.class;
    }

    protected final CurrentEmploymentNodeComponent getComponent() {
        return component;
    }


    private CurrentEmploymentNodeComponent component;

    @Inject
    void createComponent(CurrentEmploymentNodeComponent.Builder builder) {
        this.component = builder.setCurrentEmploymentNodeModule(new CurrentEmploymentNodeModule(this)).build();
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
