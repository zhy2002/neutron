package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PropertyWeeklyRentNodeScope
@Subcomponent(modules = {PropertyWeeklyRentNodeModule.class})
public interface PropertyWeeklyRentNodeComponent {

    PropertyWeeklyRentNodeRuleProvider getPropertyWeeklyRentNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyWeeklyRentNodeModule(PropertyWeeklyRentNodeModule module);

        PropertyWeeklyRentNodeComponent build();
    }
}
