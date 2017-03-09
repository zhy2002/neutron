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

    @Provides @OtherAssetNodeScope @Owner OtherAssetNode provideOtherAssetNode() {
        return owner;
    }

    @Provides @OtherAssetNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @OtherAssetNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @OtherAssetNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherAssetNodeScope OtherAssetListNode provideOtherAssetListNode() {
        return owner.getParent();
    }

}