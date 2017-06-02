package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsAccountNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SavingsAccountNameNode extends StringUiNode<SavingsAccountNode> {

    @Inject
    protected SavingsAccountNameNode(@Owner SavingsAccountNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsAccountNameNode.class;
    }

    protected final SavingsAccountNameNodeComponent getComponent() {
        return component;
    }


    private SavingsAccountNameNodeComponent component;

    @Inject
    void createComponent(SavingsAccountNameNodeComponent.Builder builder) {
        this.component = builder.setSavingsAccountNameNodeModule(new SavingsAccountNameNodeModule(this)).build();
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
