package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.DateCreatedNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class DateCreatedNode extends StringUiNode<ApplicationNode> {

    @Inject
    public DateCreatedNode(@Owner ApplicationNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return DateCreatedNode.class;
    }

    protected final DateCreatedNodeComponent getComponent() {
        return component;
    }


    private DateCreatedNodeComponent component;

    @Inject
    void createComponent(DateCreatedNodeComponent.Builder builder) {
        this.component = builder.setDateCreatedNodeModule(new DateCreatedNodeModule(this)).build();
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
