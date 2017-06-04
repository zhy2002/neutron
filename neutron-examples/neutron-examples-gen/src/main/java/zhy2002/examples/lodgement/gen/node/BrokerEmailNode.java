package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BrokerEmailNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BrokerEmailNode extends EmailNode<SubmissionNode> {

    @Inject
    protected BrokerEmailNode(@Owner SubmissionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BrokerEmailNode.class;
    }

    protected final BrokerEmailNodeComponent getComponent() {
        return component;
    }


    private BrokerEmailNodeComponent component;

    @Inject
    void createComponent(BrokerEmailNodeComponent.Builder builder) {
        this.component = builder.setBrokerEmailNodeModule(new BrokerEmailNodeModule(this)).build();
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
