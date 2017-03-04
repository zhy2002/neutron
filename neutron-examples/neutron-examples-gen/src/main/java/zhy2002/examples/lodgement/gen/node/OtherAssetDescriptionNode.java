package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OtherAssetDescriptionNode extends StringUiNode<OtherAssetNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherAssetDescriptionNode.class;
    }

    private OtherAssetDescriptionNodeComponent component;

    @Inject
    void createComponent(OtherAssetDescriptionNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetDescriptionNodeModule(new OtherAssetDescriptionNodeModule(this)).build();
    }

    @Override
    protected OtherAssetDescriptionNodeRuleProvider getRuleProvider() {
        return component.getOtherAssetDescriptionNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public OtherAssetDescriptionNode(@NotNull OtherAssetNode parent, String name) {
        super(parent, name);
    }

}
