package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class EmployerNameNode extends StringUiNode<EmployedNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return EmployerNameNode.class;
    }

    private EmployerNameNodeComponent component;

    @Inject
    void createComponent(EmployerNameNodeComponent.Builder builder) {
        this.component = builder.setEmployerNameNodeModule(new EmployerNameNodeModule(this)).build();
    }

    @Override
    protected EmployerNameNodeRuleProvider getRuleProvider() {
        return component.getEmployerNameNodeRuleProvider();
    }

    public EmployerNameNode(EmployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
