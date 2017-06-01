package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherAssetListNodeModule.class})
public interface OtherAssetListNodeComponent {

    List<RuleProvider<OtherAssetListNode>> provideRuleProviders();

    OtherAssetNode createOtherAssetNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetListNodeModule(OtherAssetListNodeModule module);

        OtherAssetListNodeComponent build();
    }

}
