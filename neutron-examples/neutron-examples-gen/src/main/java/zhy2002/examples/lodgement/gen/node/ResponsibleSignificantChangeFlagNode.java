package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ResponsibleSignificantChangeFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ResponsibleSignificantChangeFlagNode extends YesNoOptionNode<BaseResponsibleLendNode<?>> {

    @Inject
    protected ResponsibleSignificantChangeFlagNode(@Owner BaseResponsibleLendNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ResponsibleSignificantChangeFlagNode.class;
    }

    protected final ResponsibleSignificantChangeFlagNodeComponent getComponent() {
        return component;
    }


    private ResponsibleSignificantChangeFlagNodeComponent component;

    @Inject
    void createComponent(ResponsibleSignificantChangeFlagNodeComponent.Builder builder) {
        this.component = builder.setResponsibleSignificantChangeFlagNodeModule(new ResponsibleSignificantChangeFlagNodeModule(this)).build();
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
