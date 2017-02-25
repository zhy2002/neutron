package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class UnemployedSinceNode extends MonthYearNode<UnemployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return UnemployedSinceNode.class;
    }

    private UnemployedSinceNodeComponent component;

    @Inject
    void createComponent(UnemployedSinceNodeComponent.Builder builder) {
        this.component = builder.setUnemployedSinceNodeModule(new UnemployedSinceNodeModule(this)).build();
    }

    @Override
    protected UnemployedSinceNodeRuleProvider getRuleProvider() {
        return component.getUnemployedSinceNodeRuleProvider();
    }

    public UnemployedSinceNode(@NotNull UnemployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
