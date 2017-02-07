package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@OtherAssetNodeChildScope
@Subcomponent(modules = {OtherAssetNodeChildModule.class})
public interface OtherAssetNodeChildComponent {

    OtherAssetTypeNode provideOtherAssetTypeNode(@Named("otherAssetTypeNode") OtherAssetTypeNode impl);
    OtherAssetDescriptionNode provideOtherAssetDescriptionNode(@Named("otherAssetDescriptionNode") OtherAssetDescriptionNode impl);
    OtherAssetMarketValueNode provideOtherAssetMarketValueNode(@Named("otherAssetMarketValueNode") OtherAssetMarketValueNode impl);

}
