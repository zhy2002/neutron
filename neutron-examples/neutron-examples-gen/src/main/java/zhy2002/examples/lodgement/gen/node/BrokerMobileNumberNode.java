package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BrokerMobileNumberNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BrokerMobileNumberNode extends BaseMobileNumberNode<SubmissionNode> {

    @Inject
    protected BrokerMobileNumberNode(@Owner SubmissionNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BrokerMobileNumberNode.class;
    }

    protected final BrokerMobileNumberNodeComponent getComponent() {
        return component;
    }


    private BrokerMobileNumberNodeComponent component;

    @Inject
    void createComponent(BrokerMobileNumberNodeComponent.Builder builder) {
        this.component = builder.setBrokerMobileNumberNodeModule(new BrokerMobileNumberNodeModule(this)).build();
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
