package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PermanentResidentFlagNodeModule.class})
public interface PermanentResidentFlagNodeComponent {

    List<RuleProvider<PermanentResidentFlagNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPermanentResidentFlagNodeModule(PermanentResidentFlagNodeModule module);

        PermanentResidentFlagNodeComponent build();
    }

}
