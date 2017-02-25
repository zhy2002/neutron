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

public class RetiredSinceNode extends MonthYearNode<RetiredEmploymentNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return RetiredSinceNode.class;
    }

    private RetiredSinceNodeComponent component;

    @Inject
    void createComponent(RetiredSinceNodeComponent.Builder builder) {
        this.component = builder.setRetiredSinceNodeModule(new RetiredSinceNodeModule(this)).build();
    }

    @Override
    protected RetiredSinceNodeRuleProvider getRuleProvider() {
        return component.getRetiredSinceNodeRuleProvider();
    }

    public RetiredSinceNode(RetiredEmploymentNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
