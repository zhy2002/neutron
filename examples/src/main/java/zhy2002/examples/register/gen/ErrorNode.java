package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;

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

    public ErrorNode(@NotNull ErrorListNode parent, String name) {
        super(parent, name);
    }

}
