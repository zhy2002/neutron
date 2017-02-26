package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherAssetDescriptionNodeModule {

    private final OtherAssetDescriptionNode owner;

    public OtherAssetDescriptionNodeModule(OtherAssetDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @OtherAssetDescriptionNodeScope @Owner OtherAssetDescriptionNode provideOtherAssetDescriptionNode() {
        return owner;
    }

    @Provides @OtherAssetDescriptionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherAssetDescriptionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherAssetDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}