package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ResponsibleMitigationMethodNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ResponsibleMitigationMethodNode extends StringUiNode<BaseResponsibleLendNode<?>> {

    @Inject
    protected ResponsibleMitigationMethodNode(@Owner BaseResponsibleLendNode<?> parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ResponsibleMitigationMethodNode.class;
    }

    protected final ResponsibleMitigationMethodNodeComponent getComponent() {
        return component;
    }


    private ResponsibleMitigationMethodNodeComponent component;

    @Inject
    void createComponent(ResponsibleMitigationMethodNodeComponent.Builder builder) {
        this.component = builder.setResponsibleMitigationMethodNodeModule(new ResponsibleMitigationMethodNodeModule(this)).build();
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
