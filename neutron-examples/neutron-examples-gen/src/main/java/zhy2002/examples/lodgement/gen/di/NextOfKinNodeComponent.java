package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {NextOfKinNodeModule.class})
public interface NextOfKinNodeComponent {

    List<RuleProvider<NextOfKinNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setNextOfKinNodeModule(NextOfKinNodeModule module);

        NextOfKinNodeComponent build();
    }

}
