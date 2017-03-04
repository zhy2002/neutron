package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ErrorNode extends ValidationErrorUiNode<ErrorListNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ErrorNode.class;
    }

    private ErrorNodeComponent component;

    @Inject
    void createComponent(ErrorNodeComponent.Builder builder) {
        this.component = builder.setErrorNodeModule(new ErrorNodeModule(this)).build();
    }

    @Override
    protected ErrorNodeRuleProvider getRuleProvider() {
        return component.getErrorNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ErrorNode(@NotNull ErrorListNode parent, String name) {
        super(parent, name);
    }

}
