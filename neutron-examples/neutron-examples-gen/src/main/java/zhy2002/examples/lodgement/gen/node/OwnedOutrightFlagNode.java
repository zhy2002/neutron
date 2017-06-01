package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OwnedOutrightFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OwnedOutrightFlagNode extends BooleanUiNode<UsageNode> {

    @Inject
    public OwnedOutrightFlagNode(@Owner UsageNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OwnedOutrightFlagNode.class;
    }

    protected final OwnedOutrightFlagNodeComponent getComponent() {
        return component;
    }


    private OwnedOutrightFlagNodeComponent component;

    @Inject
    void createComponent(OwnedOutrightFlagNodeComponent.Builder builder) {
        this.component = builder.setOwnedOutrightFlagNodeModule(new OwnedOutrightFlagNodeModule(this)).build();
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
