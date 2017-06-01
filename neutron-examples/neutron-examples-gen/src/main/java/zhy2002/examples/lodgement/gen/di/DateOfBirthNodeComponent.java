package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {DateOfBirthNodeModule.class})
public interface DateOfBirthNodeComponent {


    RuleProvider<DateOfBirthNode> getDateOfBirthNodeRuleProvider();
    Map<String, RuleProvider<DateOfBirthNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setDateOfBirthNodeModule(DateOfBirthNodeModule module);

        DateOfBirthNodeComponent build();
    }

}
