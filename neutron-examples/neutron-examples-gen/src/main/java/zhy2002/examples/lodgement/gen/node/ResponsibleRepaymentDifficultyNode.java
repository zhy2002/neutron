package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ResponsibleRepaymentDifficultyNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ResponsibleRepaymentDifficultyNode extends YesNoOptionNode<BaseResponsibleLendNode<?>> {

    @Inject
    protected ResponsibleRepaymentDifficultyNode(@Owner BaseResponsibleLendNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ResponsibleRepaymentDifficultyNode.class;
    }

    protected final ResponsibleRepaymentDifficultyNodeComponent getComponent() {
        return component;
    }


    private ResponsibleRepaymentDifficultyNodeComponent component;

    @Inject
    void createComponent(ResponsibleRepaymentDifficultyNodeComponent.Builder builder) {
        this.component = builder.setResponsibleRepaymentDifficultyNodeModule(new ResponsibleRepaymentDifficultyNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
