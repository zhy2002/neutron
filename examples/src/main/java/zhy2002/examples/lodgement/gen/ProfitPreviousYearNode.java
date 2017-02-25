package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class ProfitPreviousYearNode extends BigDecimalUiNode<SelfEmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProfitPreviousYearNode.class;
    }

    private ProfitPreviousYearNodeComponent component;

    @Inject
    void createComponent(ProfitPreviousYearNodeComponent.Builder builder) {
        this.component = builder.setProfitPreviousYearNodeModule(new ProfitPreviousYearNodeModule(this)).build();
    }

    @Override
    protected ProfitPreviousYearNodeRuleProvider getRuleProvider() {
        return component.getProfitPreviousYearNodeRuleProvider();
    }

    public ProfitPreviousYearNode(@NotNull SelfEmployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
