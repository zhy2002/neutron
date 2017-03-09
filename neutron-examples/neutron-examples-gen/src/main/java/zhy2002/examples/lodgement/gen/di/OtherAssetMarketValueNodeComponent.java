package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherAssetMarketValueNodeScope
@Subcomponent(modules = {OtherAssetMarketValueNodeModule.class})
public interface OtherAssetMarketValueNodeComponent {

    OtherAssetMarketValueNodeRuleProvider getOtherAssetMarketValueNodeRuleProvider();
    Map<String, RuleProvider<OtherAssetMarketValueNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetMarketValueNodeModule(OtherAssetMarketValueNodeModule module);

        OtherAssetMarketValueNodeComponent build();
    }
}
