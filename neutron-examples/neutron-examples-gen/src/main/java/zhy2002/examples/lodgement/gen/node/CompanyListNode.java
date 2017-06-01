package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class CompanyListNode extends ListUiNode<ApplicationNode,CompanyNode> {

    @Inject
    public CompanyListNode(@Owner ApplicationNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyListNode.class;
    }

    protected final CompanyListNodeComponent getComponent() {
        return component;
    }


    private CompanyListNodeComponent component;

    @Inject
    void createComponent(CompanyListNodeComponent.Builder builder) {
        this.component = builder.setCompanyListNodeModule(new CompanyListNodeModule(this)).build();
    }

    private RuleProvider<CompanyListNode> getRuleProvider() {
        return component.getCompanyListNodeRuleProvider();
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

    private RuleProvider<CompanyListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<CompanyNode> getItemClass() {
        return CompanyNode.class;
    }

    @Override
    public NodeAddEvent<CompanyNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        getContext().setNameOfNodeBeingCreated(name);
        CompanyNode item = getComponent().createCompanyNode();
        getContext().setNameOfNodeBeingCreated(null);
        return new CompanyNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<CompanyNode> createItemRemoveEvent(CompanyNode item) {
        return new CompanyNodeRemoveEvent(item);
    }

}
