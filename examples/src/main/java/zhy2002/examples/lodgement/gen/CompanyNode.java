package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
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

    public CompanyNode(CompanyListNode parent, String name) {
        super(parent, name);
    }

}
