package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AdditionalCommentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AdditionalCommentNode extends StringUiNode<AdditionalNode> {

    @Inject
    protected AdditionalCommentNode(@Owner AdditionalNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AdditionalCommentNode.class;
    }

    protected final AdditionalCommentNodeComponent getComponent() {
        return component;
    }


    private AdditionalCommentNodeComponent component;

    @Inject
    void createComponent(AdditionalCommentNodeComponent.Builder builder) {
        this.component = builder.setAdditionalCommentNodeModule(new AdditionalCommentNodeModule(this)).build();
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
