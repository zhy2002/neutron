package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.UsedAsSecurityFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class UsedAsSecurityFlagNode extends BooleanUiNode<UsageNode> {

    @Inject
    protected UsedAsSecurityFlagNode(@Owner UsageNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return UsedAsSecurityFlagNode.class;
    }

    protected final UsedAsSecurityFlagNodeComponent getComponent() {
        return component;
    }


    private UsedAsSecurityFlagNodeComponent component;

    @Inject
    void createComponent(UsedAsSecurityFlagNodeComponent.Builder builder) {
        this.component = builder.setUsedAsSecurityFlagNodeModule(new UsedAsSecurityFlagNodeModule(this)).build();
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
