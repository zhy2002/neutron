package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ErrorNode extends ValidationErrorUiNode<ErrorListNode> {

    @Inject
    public ErrorNode(@Owner ErrorListNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ErrorNode.class;
    }

    private ErrorNodeComponent component;

    @Inject
    void createComponent(ErrorNodeComponent.Builder builder) {
        this.component = builder.setErrorNodeModule(new ErrorNodeModule(this)).build();
    }

    private RuleProvider<ErrorNode> getRuleProvider() {
        return component.getErrorNodeRuleProvider();
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
