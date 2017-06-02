package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AgeOfDependantsNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AgeOfDependantsNode extends ObjectUiNode<PersonGeneralNode> {

    @Inject
    protected AgeOfDependantsNode(@Owner PersonGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AgeOfDependantsNode.class;
    }

    protected final AgeOfDependantsNodeComponent getComponent() {
        return component;
    }


    private AgeOfDependantsNodeComponent component;

    @Inject
    void createComponent(AgeOfDependantsNodeComponent.Builder builder) {
        this.component = builder.setAgeOfDependantsNodeModule(new AgeOfDependantsNodeModule(this)).build();
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
