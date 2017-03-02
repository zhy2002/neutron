package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherAssetMarketValueNodeScope
@Subcomponent(modules = {OtherAssetMarketValueNodeModule.class})
public interface OtherAssetMarketValueNodeComponent {

    OtherAssetMarketValueNodeRuleProvider getOtherAssetMarketValueNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetMarketValueNodeModule(OtherAssetMarketValueNodeModule module);

        OtherAssetMarketValueNodeComponent build();
    }
}
