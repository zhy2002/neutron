package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyContactNode extends BaseContactNode<CompanyNode> {

    private CompanyContactFirstNameNode companyContactFirstNameNode;
    private CompanyContactLastNameNode companyContactLastNameNode;

    private CompanyContactNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(CompanyContactNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyContactNode.class;
    }

    private CompanyContactNodeComponent component;

    @Inject
    void createComponent(CompanyContactNodeComponent.Builder builder) {
        this.component = builder.setCompanyContactNodeModule(new CompanyContactNodeModule(this)).build();
    }

    @Override
    protected CompanyContactNodeRuleProvider getRuleProvider() {
        return component.getCompanyContactNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyContactNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public CompanyContactFirstNameNode getCompanyContactFirstNameNode() {
        return companyContactFirstNameNode;
    }

    @JsMethod
    public CompanyContactLastNameNode getCompanyContactLastNameNode() {
        return companyContactLastNameNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        companyContactFirstNameNode = childFactory.createCompanyContactFirstNameNode();
        children.add(companyContactFirstNameNode);
        companyContactLastNameNode = childFactory.createCompanyContactLastNameNode();
        children.add(companyContactLastNameNode);
        return children;
    }

}
