package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {PreviousEmploymentListNodeModule.class})
public interface PreviousEmploymentListNodeComponent {

    List<RuleProvider<PreviousEmploymentListNode>> provideRuleProviders();

    PreviousEmploymentNode createPreviousEmploymentNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setPreviousEmploymentListNodeModule(PreviousEmploymentListNodeModule module);

        PreviousEmploymentListNodeComponent build();
    }

}
