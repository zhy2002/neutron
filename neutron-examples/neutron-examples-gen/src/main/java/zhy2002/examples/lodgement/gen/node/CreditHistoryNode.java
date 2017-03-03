package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected CreditHistoryNodeRuleProvider getRuleProvider() {
        return component.getCreditHistoryNodeRuleProvider();
    }

    public CreditHistoryNode(@NotNull CreditHistoryListNode parent, String name) {
        super(parent, name);
    }

}
