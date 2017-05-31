package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CreditHistoryNode extends StringUiNode<CreditHistoryListNode> {
    private CreditHistoryNodeComponent component;

    public CreditHistoryNode(@NotNull CreditHistoryListNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CreditHistoryNode.class;
    }

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
