package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyAbrnNode extends StringUiNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyAbrnNode.class;
    }

    private CompanyAbrnNodeComponent component;

    @Inject
    void createComponent(CompanyAbrnNodeComponent.Builder builder) {
        this.component = builder.setCompanyAbrnNodeModule(new CompanyAbrnNodeModule(this)).build();
    }

    @Override
    protected CompanyAbrnNodeRuleProvider getRuleProvider() {
        return component.getCompanyAbrnNodeRuleProvider();
    }

    public CompanyAbrnNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}
