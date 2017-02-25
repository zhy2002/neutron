package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class CompanyListNode extends ListUiNode<ApplicationNode,CompanyNode> {

    private CompanyListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(CompanyListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyListNode.class;
    }

    private CompanyListNodeComponent component;

    @Inject
    void createComponent(CompanyListNodeComponent.Builder builder) {
        this.component = builder.setCompanyListNodeModule(new CompanyListNodeModule(this)).build();
    }

    @Override
    protected CompanyListNodeRuleProvider getRuleProvider() {
        return component.getCompanyListNodeRuleProvider();
    }

    public CompanyListNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<CompanyNode> getItemClass() {
        return CompanyNode.class;
    }

    public NodeAddEvent<CompanyNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<CompanyNode> createItemRemoveEvent(CompanyNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
