package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.PreviousEmploymentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PreviousEmploymentNode extends EmploymentNode<PreviousEmploymentListNode> {

    @Inject
    protected PreviousEmploymentNode(@Owner PreviousEmploymentListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PreviousEmploymentNode.class;
    }

    protected final PreviousEmploymentNodeComponent getComponent() {
        return component;
    }


    private PreviousEmploymentNodeComponent component;

    @Inject
    void createComponent(PreviousEmploymentNodeComponent.Builder builder) {
        this.component = builder.setPreviousEmploymentNodeModule(new PreviousEmploymentNodeModule(this)).build();
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
