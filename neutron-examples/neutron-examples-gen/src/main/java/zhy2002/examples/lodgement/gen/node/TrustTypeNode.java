package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustTypeNode extends StringUiNode<BaseTrustNode<?>> {

    @Inject
    protected TrustTypeNode(@Owner BaseTrustNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustTypeNode.class;
    }

    protected final TrustTypeNodeComponent getComponent() {
        return component;
    }


    private TrustTypeNodeComponent component;

    @Inject
    void createComponent(TrustTypeNodeComponent.Builder builder) {
        this.component = builder.setTrustTypeNodeModule(new TrustTypeNodeModule(this)).build();
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
