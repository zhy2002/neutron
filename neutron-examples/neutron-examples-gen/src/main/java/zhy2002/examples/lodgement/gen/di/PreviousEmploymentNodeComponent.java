package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PreviousEmploymentNodeModule.class})
public interface PreviousEmploymentNodeComponent extends EmploymentNodeComponent {

    List<RuleProvider<PreviousEmploymentNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setPreviousEmploymentNodeModule(PreviousEmploymentNodeModule module);

        PreviousEmploymentNodeComponent build();
    }

}
