package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ResponsibleTypeOfChangeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ResponsibleTypeOfChangeNode extends StringUiNode<BaseResponsibleLendNode<?>> {

    @Inject
    public ResponsibleTypeOfChangeNode(@Owner BaseResponsibleLendNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ResponsibleTypeOfChangeNode.class;
    }

    protected final ResponsibleTypeOfChangeNodeComponent getComponent() {
        return component;
    }


    private ResponsibleTypeOfChangeNodeComponent component;

    @Inject
    void createComponent(ResponsibleTypeOfChangeNodeComponent.Builder builder) {
        this.component = builder.setResponsibleTypeOfChangeNodeModule(new ResponsibleTypeOfChangeNodeModule(this)).build();
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
