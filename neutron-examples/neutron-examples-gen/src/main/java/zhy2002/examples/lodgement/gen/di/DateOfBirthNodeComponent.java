package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@DateOfBirthNodeScope
@Subcomponent(modules = {DateOfBirthNodeModule.class})
public interface DateOfBirthNodeComponent {

    DateOfBirthNodeRuleProvider getDateOfBirthNodeRuleProvider();
    Map<String, RuleProvider<DateOfBirthNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setDateOfBirthNodeModule(DateOfBirthNodeModule module);

        DateOfBirthNodeComponent build();
    }
}
