package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ResponsibleSignificantChangeFlagNode extends YesNoOptionNode<BaseResponsibleLendNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return ResponsibleSignificantChangeFlagNode.class;
    }

    private ResponsibleSignificantChangeFlagNodeComponent component;

    @Inject
    void createComponent(ResponsibleSignificantChangeFlagNodeComponent.Builder builder) {
        this.component = builder.setResponsibleSignificantChangeFlagNodeModule(new ResponsibleSignificantChangeFlagNodeModule(this)).build();
    }

    @Override
    protected ResponsibleSignificantChangeFlagNodeRuleProvider getRuleProvider() {
        return component.getResponsibleSignificantChangeFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ResponsibleSignificantChangeFlagNode(@NotNull BaseResponsibleLendNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
