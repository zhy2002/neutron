package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;

public class ErrorNode extends ValidationErrorUiNode<ErrorListNode>
{
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

    public ErrorNode(ErrorListNode parent, String name) {
        super(parent, name);
    }

}
