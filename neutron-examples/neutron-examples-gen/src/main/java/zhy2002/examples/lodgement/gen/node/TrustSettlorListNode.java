package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustSettlorListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustSettlorListNode extends SelectRelatedPersonListNode<BaseTrustNode<?>> {

    @Inject
    protected TrustSettlorListNode(@Owner BaseTrustNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustSettlorListNode.class;
    }

    protected final TrustSettlorListNodeComponent getComponent() {
        return component;
    }


    private TrustSettlorListNodeComponent component;

    @Inject
    void createComponent(TrustSettlorListNodeComponent.Builder builder) {
        this.component = builder.setTrustSettlorListNodeModule(new TrustSettlorListNodeModule(this)).build();
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
