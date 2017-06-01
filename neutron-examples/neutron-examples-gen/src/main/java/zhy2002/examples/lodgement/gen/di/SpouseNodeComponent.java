package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {SpouseNodeModule.class})
public interface SpouseNodeComponent {

    List<RuleProvider<SpouseNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setSpouseNodeModule(SpouseNodeModule module);

        SpouseNodeComponent build();
    }

}
