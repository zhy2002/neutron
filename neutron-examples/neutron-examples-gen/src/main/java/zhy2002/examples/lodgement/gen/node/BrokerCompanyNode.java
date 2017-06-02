package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BrokerCompanyNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BrokerCompanyNode extends StringUiNode<SubmissionNode> {

    @Inject
    protected BrokerCompanyNode(@Owner SubmissionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BrokerCompanyNode.class;
    }

    protected final BrokerCompanyNodeComponent getComponent() {
        return component;
    }


    private BrokerCompanyNodeComponent component;

    @Inject
    void createComponent(BrokerCompanyNodeComponent.Builder builder) {
        this.component = builder.setBrokerCompanyNodeModule(new BrokerCompanyNodeModule(this)).build();
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
