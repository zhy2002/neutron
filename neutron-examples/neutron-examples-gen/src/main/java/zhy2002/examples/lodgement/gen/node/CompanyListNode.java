package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private CompanyListNodeRuleProvider getRuleProvider() {
        return component.getCompanyListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
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
