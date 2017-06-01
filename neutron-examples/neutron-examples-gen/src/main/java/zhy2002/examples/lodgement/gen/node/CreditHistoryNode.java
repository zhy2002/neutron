package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditHistoryNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditHistoryNode extends StringUiNode<CreditHistoryListNode> {

    @Inject
    public CreditHistoryNode(@Owner CreditHistoryListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditHistoryNode.class;
    }

    protected final CreditHistoryNodeComponent getComponent() {
        return component;
    }


    private CreditHistoryNodeComponent component;

    @Inject
    void createComponent(CreditHistoryNodeComponent.Builder builder) {
        this.component = builder.setCreditHistoryNodeModule(new CreditHistoryNodeModule(this)).build();
    }

    private RuleProvider<CreditHistoryNode> getRuleProvider() {
        return component.getCreditHistoryNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

}
