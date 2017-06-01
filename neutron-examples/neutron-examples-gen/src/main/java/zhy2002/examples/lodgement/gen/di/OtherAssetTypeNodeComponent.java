package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherAssetTypeNodeModule.class})
public interface OtherAssetTypeNodeComponent {

    List<RuleProvider<OtherAssetTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetTypeNodeModule(OtherAssetTypeNodeModule module);

        OtherAssetTypeNodeComponent build();
    }

}
