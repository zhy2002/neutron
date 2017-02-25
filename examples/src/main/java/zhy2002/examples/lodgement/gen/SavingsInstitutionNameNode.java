package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class SavingsInstitutionNameNode extends StringUiNode<SavingsAccountNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsInstitutionNameNode.class;
    }

    private SavingsInstitutionNameNodeComponent component;

    @Inject
    void createComponent(SavingsInstitutionNameNodeComponent.Builder builder) {
        this.component = builder.setSavingsInstitutionNameNodeModule(new SavingsInstitutionNameNodeModule(this)).build();
    }

    @Override
    protected SavingsInstitutionNameNodeRuleProvider getRuleProvider() {
        return component.getSavingsInstitutionNameNodeRuleProvider();
    }

    public SavingsInstitutionNameNode(@NotNull SavingsAccountNode parent, String name) {
        super(parent, name);
    }

}
