package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SelectRelatedPersonFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SelectRelatedPersonFlagNode extends BooleanUiNode<SelectRelatedPersonNode> {

    @Inject
    public SelectRelatedPersonFlagNode(@Owner SelectRelatedPersonNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SelectRelatedPersonFlagNode.class;
    }

    protected final SelectRelatedPersonFlagNodeComponent getComponent() {
        return component;
    }


    private SelectRelatedPersonFlagNodeComponent component;

    @Inject
    void createComponent(SelectRelatedPersonFlagNodeComponent.Builder builder) {
        this.component = builder.setSelectRelatedPersonFlagNodeModule(new SelectRelatedPersonFlagNodeModule(this)).build();
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
