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

public class PreviousEmploymentNode extends EmploymentNode<PreviousEmploymentListNode>
{
    @Override
    public final Class<?> getConcreteClass() {
        return PreviousEmploymentNode.class;
    }

    private PreviousEmploymentNodeComponent component;

    @Inject
    void createComponent(PreviousEmploymentNodeComponent.Builder builder) {
        this.component = builder.setPreviousEmploymentNodeModule(new PreviousEmploymentNodeModule(this)).build();
    }

    @Override
    protected PreviousEmploymentNodeRuleProvider getRuleProvider() {
        return component.getPreviousEmploymentNodeRuleProvider();
    }

    public PreviousEmploymentNode(PreviousEmploymentListNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setNodeLabel("Employment");
    }

}
