package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.GenderNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class GenderNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public GenderNode(@Owner PersonGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return GenderNode.class;
    }

    protected final GenderNodeComponent getComponent() {
        return component;
    }


    private GenderNodeComponent component;

    @Inject
    void createComponent(GenderNodeComponent.Builder builder) {
        this.component = builder.setGenderNodeModule(new GenderNodeModule(this)).build();
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
