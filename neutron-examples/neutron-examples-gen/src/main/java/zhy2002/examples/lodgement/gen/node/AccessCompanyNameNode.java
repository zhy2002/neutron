package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AccessCompanyNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccessCompanyNameNode extends StringUiNode<AccessNode> {

    @Inject
    protected AccessCompanyNameNode(@Owner AccessNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessCompanyNameNode.class;
    }

    protected final AccessCompanyNameNodeComponent getComponent() {
        return component;
    }


    private AccessCompanyNameNodeComponent component;

    @Inject
    void createComponent(AccessCompanyNameNodeComponent.Builder builder) {
        this.component = builder.setAccessCompanyNameNodeModule(new AccessCompanyNameNodeModule(this)).build();
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
