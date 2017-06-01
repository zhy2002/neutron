package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SavingsTypeNode extends StringUiNode<SavingsAccountNode> {

    @Inject
    public SavingsTypeNode(@Owner SavingsAccountNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsTypeNode.class;
    }

    protected final SavingsTypeNodeComponent getComponent() {
        return component;
    }


    private SavingsTypeNodeComponent component;

    @Inject
    void createComponent(SavingsTypeNodeComponent.Builder builder) {
        this.component = builder.setSavingsTypeNodeModule(new SavingsTypeNodeModule(this)).build();
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
