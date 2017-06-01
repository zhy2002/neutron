package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.YearNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class YearNode extends BigDecimalUiNode<MonthYearNode<?>> {

    @Inject
    public YearNode(@Owner MonthYearNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return YearNode.class;
    }

    protected final YearNodeComponent getComponent() {
        return component;
    }


    private YearNodeComponent component;

    @Inject
    void createComponent(YearNodeComponent.Builder builder) {
        this.component = builder.setYearNodeModule(new YearNodeModule(this)).build();
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
