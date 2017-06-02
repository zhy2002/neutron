package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LenderIssuedBrokerNumberNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LenderIssuedBrokerNumberNode extends StringUiNode<SubmissionNode> {

    @Inject
    protected LenderIssuedBrokerNumberNode(@Owner SubmissionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LenderIssuedBrokerNumberNode.class;
    }

    protected final LenderIssuedBrokerNumberNodeComponent getComponent() {
        return component;
    }


    private LenderIssuedBrokerNumberNodeComponent component;

    @Inject
    void createComponent(LenderIssuedBrokerNumberNodeComponent.Builder builder) {
        this.component = builder.setLenderIssuedBrokerNumberNodeModule(new LenderIssuedBrokerNumberNodeModule(this)).build();
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
