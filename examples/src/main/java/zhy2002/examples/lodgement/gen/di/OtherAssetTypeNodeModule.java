package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OtherAssetTypeNodeModule {

    private final OtherAssetTypeNode owner;

    public OtherAssetTypeNodeModule(OtherAssetTypeNode owner) {
        this.owner = owner;
    }

    @Provides @OtherAssetTypeNodeScope @Owner OtherAssetTypeNode provideOtherAssetTypeNode() {
        return owner;
    }

    @Provides @OtherAssetTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OtherAssetTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherAssetTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}