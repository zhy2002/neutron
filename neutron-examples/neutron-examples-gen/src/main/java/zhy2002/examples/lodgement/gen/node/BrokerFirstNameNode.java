package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BrokerFirstNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BrokerFirstNameNode extends NameNode<SubmissionNode> {

    @Inject
    protected BrokerFirstNameNode(@Owner SubmissionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BrokerFirstNameNode.class;
    }

    protected final BrokerFirstNameNodeComponent getComponent() {
        return component;
    }


    private BrokerFirstNameNodeComponent component;

    @Inject
    void createComponent(BrokerFirstNameNodeComponent.Builder builder) {
        this.component = builder.setBrokerFirstNameNodeModule(new BrokerFirstNameNodeModule(this)).build();
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
