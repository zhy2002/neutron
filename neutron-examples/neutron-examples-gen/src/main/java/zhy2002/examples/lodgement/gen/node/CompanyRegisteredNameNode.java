package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyRegisteredNameNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyRegisteredNameNode.class;
    }

    private CompanyRegisteredNameNodeComponent component;

    @Inject
    void createComponent(CompanyRegisteredNameNodeComponent.Builder builder) {
        this.component = builder.setCompanyRegisteredNameNodeModule(new CompanyRegisteredNameNodeModule(this)).build();
    }

    @Override
    protected CompanyRegisteredNameNodeRuleProvider getRuleProvider() {
        return component.getCompanyRegisteredNameNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyRegisteredNameNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
