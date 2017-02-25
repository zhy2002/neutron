package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class CompanyNode extends ObjectUiNode<CompanyListNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyNode.class;
    }

    private CompanyNodeComponent component;

    @Inject
    void createComponent(CompanyNodeComponent.Builder builder) {
        this.component = builder.setCompanyNodeModule(new CompanyNodeModule(this)).build();
    }

    @Override
    protected CompanyNodeRuleProvider getRuleProvider() {
        return component.getCompanyNodeRuleProvider();
    }

    public CompanyNode(@NotNull CompanyListNode parent, String name) {
        super(parent, name);
    }

}
