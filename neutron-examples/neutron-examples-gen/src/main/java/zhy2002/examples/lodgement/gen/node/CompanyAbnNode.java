package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyAbnNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyAbnNode.class;
    }

    private CompanyAbnNodeComponent component;

    @Inject
    void createComponent(CompanyAbnNodeComponent.Builder builder) {
        this.component = builder.setCompanyAbnNodeModule(new CompanyAbnNodeModule(this)).build();
    }

    @Override
    protected CompanyAbnNodeRuleProvider getRuleProvider() {
        return component.getCompanyAbnNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyAbnNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
