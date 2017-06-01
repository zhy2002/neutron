package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MaritalStatusNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MaritalStatusNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    public MaritalStatusNode(@Owner PersonGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MaritalStatusNode.class;
    }

    protected final MaritalStatusNodeComponent getComponent() {
        return component;
    }


    private MaritalStatusNodeComponent component;

    @Inject
    void createComponent(MaritalStatusNodeComponent.Builder builder) {
        this.component = builder.setMaritalStatusNodeModule(new MaritalStatusNodeModule(this)).build();
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
