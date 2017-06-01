package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class OtherAssetNodeModule {

    private final OtherAssetNode owner;

    public OtherAssetNodeModule(OtherAssetNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherAssetNode provideOtherAssetNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope OtherAssetListNode provideOtherAssetListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherAssetNode> provideRuleProvider(Provider<OtherAssetNodeRuleProvider> provider) {
        return provider.get();
    }

}