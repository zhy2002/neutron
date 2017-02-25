package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class ProfitThisYearNode extends BigDecimalUiNode<SelfEmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ProfitThisYearNode.class;
    }

    private ProfitThisYearNodeComponent component;

    @Inject
    void createComponent(ProfitThisYearNodeComponent.Builder builder) {
        this.component = builder.setProfitThisYearNodeModule(new ProfitThisYearNodeModule(this)).build();
    }

    @Override
    protected ProfitThisYearNodeRuleProvider getRuleProvider() {
        return component.getProfitThisYearNodeRuleProvider();
    }

    public ProfitThisYearNode(@NotNull SelfEmployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
