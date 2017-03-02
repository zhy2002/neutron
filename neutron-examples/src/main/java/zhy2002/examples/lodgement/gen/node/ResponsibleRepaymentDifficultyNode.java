package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ResponsibleRepaymentDifficultyNode extends YesNoOptionNode<BaseResponsibleLendNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return ResponsibleRepaymentDifficultyNode.class;
    }

    private ResponsibleRepaymentDifficultyNodeComponent component;

    @Inject
    void createComponent(ResponsibleRepaymentDifficultyNodeComponent.Builder builder) {
        this.component = builder.setResponsibleRepaymentDifficultyNodeModule(new ResponsibleRepaymentDifficultyNodeModule(this)).build();
    }

    @Override
    protected ResponsibleRepaymentDifficultyNodeRuleProvider getRuleProvider() {
        return component.getResponsibleRepaymentDifficultyNodeRuleProvider();
    }

    public ResponsibleRepaymentDifficultyNode(@NotNull BaseResponsibleLendNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}
