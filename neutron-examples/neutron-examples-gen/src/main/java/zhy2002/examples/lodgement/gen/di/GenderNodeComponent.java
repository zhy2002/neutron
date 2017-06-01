package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {GenderNodeModule.class})
public interface GenderNodeComponent {

    List<RuleProvider<GenderNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setGenderNodeModule(GenderNodeModule module);

        GenderNodeComponent build();
    }

}
