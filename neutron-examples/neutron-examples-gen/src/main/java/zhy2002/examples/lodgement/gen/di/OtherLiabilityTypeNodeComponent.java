package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherLiabilityTypeNodeModule.class})
public interface OtherLiabilityTypeNodeComponent {

    List<RuleProvider<OtherLiabilityTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOtherLiabilityTypeNodeModule(OtherLiabilityTypeNodeModule module);

        OtherLiabilityTypeNodeComponent build();
    }

}
