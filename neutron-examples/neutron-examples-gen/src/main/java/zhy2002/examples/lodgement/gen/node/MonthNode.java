package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MonthNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MonthNode extends BigDecimalUiNode<MonthYearNode<?>> {

    @Inject
    public MonthNode(@Owner MonthYearNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MonthNode.class;
    }

    protected final MonthNodeComponent getComponent() {
        return component;
    }


    private MonthNodeComponent component;

    @Inject
    void createComponent(MonthNodeComponent.Builder builder) {
        this.component = builder.setMonthNodeModule(new MonthNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}
