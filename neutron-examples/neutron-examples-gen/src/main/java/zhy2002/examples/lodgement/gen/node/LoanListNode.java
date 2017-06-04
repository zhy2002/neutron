package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LoanListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class LoanListNode extends ListUiNode<LiabilitiesNode, LoanNode> {

    @Inject
    protected LoanListNode(@Owner LiabilitiesNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanListNode.class;
    }

    protected final LoanListNodeComponent getComponent() {
        return component;
    }


    private LoanListNodeComponent component;

    @Inject
    void createComponent(LoanListNodeComponent.Builder builder) {
        this.component = builder.setLoanListNodeModule(new LoanListNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Class<LoanNode> getItemClass() {
        return LoanNode.class;
    }

    @Override
    public NodeAddEvent<LoanNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        LoanNode item = getComponent().createLoanNode();
        setNameOfChildBeingCreated(null);
        return new LoanNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<LoanNode> createItemRemoveEvent(LoanNode item) {
        return new LoanNodeRemoveEvent(item);
    }

}
