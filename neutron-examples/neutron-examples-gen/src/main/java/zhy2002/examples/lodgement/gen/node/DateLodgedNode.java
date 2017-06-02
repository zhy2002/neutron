package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.DateLodgedNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class DateLodgedNode extends StringUiNode<ApplicationNode> {

    @Inject
    protected DateLodgedNode(@Owner ApplicationNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return DateLodgedNode.class;
    }

    protected final DateLodgedNodeComponent getComponent() {
        return component;
    }


    private DateLodgedNodeComponent component;

    @Inject
    void createComponent(DateLodgedNodeComponent.Builder builder) {
        this.component = builder.setDateLodgedNodeModule(new DateLodgedNodeModule(this)).build();
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
