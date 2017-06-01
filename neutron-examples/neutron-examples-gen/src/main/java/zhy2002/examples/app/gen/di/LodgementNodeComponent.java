package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.app.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {LodgementNodeModule.class})
public interface LodgementNodeComponent {

    List<RuleProvider<LodgementNode>> provideRuleProviders();

    AppManagerNode createAppManagerNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setLodgementNodeModule(LodgementNodeModule module);

        LodgementNodeComponent build();
    }

}
