package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LenderNodeModule.class})
public interface LenderNodeComponent {

    List<RuleProvider<LenderNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setLenderNodeModule(LenderNodeModule module);

        LenderNodeComponent build();
    }

}
