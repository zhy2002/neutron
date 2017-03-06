package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@OtherAssetListNodeScope
@Subcomponent(modules = {OtherAssetListNodeModule.class})
public interface OtherAssetListNodeComponent {

    OtherAssetListNodeRuleProvider getOtherAssetListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetListNodeModule(OtherAssetListNodeModule module);

        OtherAssetListNodeComponent build();
    }
}
