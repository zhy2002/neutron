package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.HousingStatusNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class HousingStatusNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    protected HousingStatusNode(@Owner PersonGeneralNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return HousingStatusNode.class;
    }

    protected final HousingStatusNodeComponent getComponent() {
        return component;
    }


    private HousingStatusNodeComponent component;

    @Inject
    void createComponent(HousingStatusNodeComponent.Builder builder) {
        this.component = builder.setHousingStatusNodeModule(new HousingStatusNodeModule(this)).build();
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
