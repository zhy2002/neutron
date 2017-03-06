package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditHistoryNode extends StringUiNode<CreditHistoryListNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditHistoryNode.class;
    }

    private CreditHistoryNodeComponent component;

    @Inject
    void createComponent(CreditHistoryNodeComponent.Builder builder) {
        this.component = builder.setCreditHistoryNodeModule(new CreditHistoryNodeModule(this)).build();
    }

    private CreditHistoryNodeRuleProvider getRuleProvider() {
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


    public CreditHistoryNode(@NotNull CreditHistoryListNode parent, String name) {
        super(parent, name);
    }

}
