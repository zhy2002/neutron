package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyAcnNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyAcnNode.class;
    }

    private CompanyAcnNodeComponent component;

    @Inject
    void createComponent(CompanyAcnNodeComponent.Builder builder) {
        this.component = builder.setCompanyAcnNodeModule(new CompanyAcnNodeModule(this)).build();
    }

    @Override
    protected CompanyAcnNodeRuleProvider getRuleProvider() {
        return component.getCompanyAcnNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyAcnNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
