package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
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

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public RetiredSinceNode(@NotNull RetiredEmploymentNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
