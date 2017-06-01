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
    public SavingsInstitutionNameNode(@Owner SavingsAccountNode parent, @ChildName String name) {
        super(parent, name);
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

    private RuleProvider<SavingsInstitutionNameNode> getRuleProvider() {
        return component.getSavingsInstitutionNameNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<SavingsInstitutionNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
