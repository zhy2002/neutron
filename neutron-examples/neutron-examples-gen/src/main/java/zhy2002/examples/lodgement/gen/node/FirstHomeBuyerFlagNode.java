package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.FirstHomeBuyerFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class FirstHomeBuyerFlagNode extends BooleanUiNode<PersonGeneralNode> {

    @Inject
    protected FirstHomeBuyerFlagNode(@Owner PersonGeneralNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return FirstHomeBuyerFlagNode.class;
    }

    protected final FirstHomeBuyerFlagNodeComponent getComponent() {
        return component;
    }


    private FirstHomeBuyerFlagNodeComponent component;

    @Inject
    void createComponent(FirstHomeBuyerFlagNodeComponent.Builder builder) {
        this.component = builder.setFirstHomeBuyerFlagNodeModule(new FirstHomeBuyerFlagNodeModule(this)).build();
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
