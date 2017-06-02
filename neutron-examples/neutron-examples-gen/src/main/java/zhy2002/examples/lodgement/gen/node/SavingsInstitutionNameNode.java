package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsInstitutionNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SavingsInstitutionNameNode extends StringUiNode<SavingsAccountNode> {

    @Inject
    protected SavingsInstitutionNameNode(@Owner SavingsAccountNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsInstitutionNameNode.class;
    }

    protected final SavingsInstitutionNameNodeComponent getComponent() {
        return component;
    }


    private SavingsInstitutionNameNodeComponent component;

    @Inject
    void createComponent(SavingsInstitutionNameNodeComponent.Builder builder) {
        this.component = builder.setSavingsInstitutionNameNodeModule(new SavingsInstitutionNameNodeModule(this)).build();
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
