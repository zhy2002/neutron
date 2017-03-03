package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherAssetTypeNodeScope
@Subcomponent(modules = {OtherAssetTypeNodeModule.class})
public interface OtherAssetTypeNodeComponent {

    OtherAssetTypeNodeRuleProvider getOtherAssetTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetTypeNodeModule(OtherAssetTypeNodeModule module);

        OtherAssetTypeNodeComponent build();
    }
}
