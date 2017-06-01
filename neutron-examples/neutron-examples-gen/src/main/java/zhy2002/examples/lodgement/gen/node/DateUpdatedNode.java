package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.DateUpdatedNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class DateUpdatedNode extends StringUiNode<ApplicationNode> {

    @Inject
    public DateUpdatedNode(@Owner ApplicationNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return DateUpdatedNode.class;
    }

    protected final DateUpdatedNodeComponent getComponent() {
        return component;
    }


    private DateUpdatedNodeComponent component;

    @Inject
    void createComponent(DateUpdatedNodeComponent.Builder builder) {
        this.component = builder.setDateUpdatedNodeModule(new DateUpdatedNodeModule(this)).build();
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
