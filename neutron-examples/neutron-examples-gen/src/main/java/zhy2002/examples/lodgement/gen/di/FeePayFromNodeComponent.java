package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {FeePayFromNodeModule.class})
public interface FeePayFromNodeComponent {

    List<RuleProvider<FeePayFromNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setFeePayFromNodeModule(FeePayFromNodeModule module);

        FeePayFromNodeComponent build();
    }

}
