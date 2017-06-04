package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsBsbNoNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SavingsBsbNoNode extends StringUiNode<SavingsAccountNode> {

    @Inject
    protected SavingsBsbNoNode(@Owner SavingsAccountNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsBsbNoNode.class;
    }

    protected final SavingsBsbNoNodeComponent getComponent() {
        return component;
    }


    private SavingsBsbNoNodeComponent component;

    @Inject
    void createComponent(SavingsBsbNoNodeComponent.Builder builder) {
        this.component = builder.setSavingsBsbNoNodeModule(new SavingsBsbNoNodeModule(this)).build();
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
