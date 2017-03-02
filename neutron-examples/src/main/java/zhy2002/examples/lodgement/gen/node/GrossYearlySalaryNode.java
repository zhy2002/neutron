package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class GrossYearlySalaryNode extends BaseCurrencyNode<PayeEmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return GrossYearlySalaryNode.class;
    }

    private GrossYearlySalaryNodeComponent component;

    @Inject
    void createComponent(GrossYearlySalaryNodeComponent.Builder builder) {
        this.component = builder.setGrossYearlySalaryNodeModule(new GrossYearlySalaryNodeModule(this)).build();
    }

    @Override
    protected GrossYearlySalaryNodeRuleProvider getRuleProvider() {
        return component.getGrossYearlySalaryNodeRuleProvider();
    }

    public GrossYearlySalaryNode(@NotNull PayeEmployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
