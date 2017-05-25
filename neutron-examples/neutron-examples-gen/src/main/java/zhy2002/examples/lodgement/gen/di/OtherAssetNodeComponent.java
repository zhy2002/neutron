package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@OtherAssetNodeScope
@Subcomponent(modules = {OtherAssetNodeModule.class})
public interface OtherAssetNodeComponent {

    RuleProvider<OtherAssetNode> getOtherAssetNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetNodeModule(OtherAssetNodeModule module);

        OtherAssetNodeComponent build();
    }
}
