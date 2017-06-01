package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherTitleNodeModule.class})
public interface OtherTitleNodeComponent {

    List<RuleProvider<OtherTitleNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOtherTitleNodeModule(OtherTitleNodeModule module);

        OtherTitleNodeComponent build();
    }

}
