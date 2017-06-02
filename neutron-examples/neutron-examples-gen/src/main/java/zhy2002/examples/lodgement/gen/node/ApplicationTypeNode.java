package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ApplicationTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ApplicationTypeNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    protected ApplicationTypeNode(@Owner PersonGeneralNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ApplicationTypeNode.class;
    }

    protected final ApplicationTypeNodeComponent getComponent() {
        return component;
    }


    private ApplicationTypeNodeComponent component;

    @Inject
    void createComponent(ApplicationTypeNodeComponent.Builder builder) {
        this.component = builder.setApplicationTypeNodeModule(new ApplicationTypeNodeModule(this)).build();
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
