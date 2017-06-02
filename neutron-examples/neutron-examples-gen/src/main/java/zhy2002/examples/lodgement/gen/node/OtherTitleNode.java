package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherTitleNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherTitleNode extends StringUiNode<PersonGeneralNode> {

    @Inject
    protected OtherTitleNode(@Owner PersonGeneralNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherTitleNode.class;
    }

    protected final OtherTitleNodeComponent getComponent() {
        return component;
    }


    private OtherTitleNodeComponent component;

    @Inject
    void createComponent(OtherTitleNodeComponent.Builder builder) {
        this.component = builder.setOtherTitleNodeModule(new OtherTitleNodeModule(this)).build();
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
